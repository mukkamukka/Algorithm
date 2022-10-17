package 해시;

/* https://www.acmicpc.net/problem/7785 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> hm = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String strOne = st.nextToken();
            String strTwo = st.nextToken();
            hm.put(strOne, strTwo);
            if (strTwo.equals("leave")) {
                hm.remove(strOne);
            }
        }
        System.out.println(hm);
        Object[] arr = hm.keySet().toArray();
        Arrays.sort(arr,Collections.reverseOrder());
        for (Object str : arr) {
            System.out.println(str);
        }
    }
}
