package 해시;

/* https://www.acmicpc.net/problem/1302 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ_1302 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }

        int maxValue = Collections.max(hm.values());
        ArrayList<String> arr = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == maxValue) {
                arr.add(entry.getKey());
            }
        }

        Collections.sort(arr);
        System.out.println(arr.get(0));
    }
}
