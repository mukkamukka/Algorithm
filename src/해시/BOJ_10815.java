package 해시;

/* https://www.acmicpc.net/problem/10815 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> hm = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer nSt = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            hm.put(nSt.nextToken(), 1);
        }

        int m = Integer.parseInt(br.readLine());
        StringTokenizer mSt = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            if (hm.containsKey(mSt.nextToken())) {
                sb.append("1" + " ");
            } else {
                sb.append("0" + " ");
            }
        }

        System.out.print(sb);
    }
}
