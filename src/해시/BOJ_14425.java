package 해시;

/* https://www.acmicpc.net/problem/14425 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            hm.put(str, 1);
        }

        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (hm.containsKey(str)) {
                count++;
            }
        }

        System.out.print(count);
    }
}
