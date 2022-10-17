package 해시;

/* https://www.acmicpc.net/problem/1764 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < n + m; i++) {
            String str = br.readLine();
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 2) {
                count++;
                arr.add(entry.getKey());
            }
        }
        Collections.sort(arr);
        System.out.println(count);
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
