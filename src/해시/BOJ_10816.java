package 해시;

/* https://www.acmicpc.net/problem/10816 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> hm = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer nSt = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = nSt.nextToken();
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer mSt = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            String str = mSt.nextToken();
            if (hm.containsKey(str)) {
                sb.append(hm.get(str)+ " ");
            } else {
                sb.append("0" + " ");
            }
        }

        System.out.print(sb);
    }
}
