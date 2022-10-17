package 해시;

/* https://www.acmicpc.net/problem/9375 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int result = 1;
            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String strTwo = st.nextToken();
                hm.put(strTwo, hm.getOrDefault(strTwo, 0) + 1);
            }

            for (int k : hm.values()) {
                result = result * (k + 1);
            }
            System.out.println(result - 1);
            hm.clear();
        }
    }
}
