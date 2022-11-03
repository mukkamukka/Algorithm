package 수학;

/* https://www.acmicpc.net/problem/1929 */

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        boolean[] remove = new boolean[1000001];

        remove[0] = true;
        remove[1] = true;

        for (int i = 2; i < remove.length; i++) {
            if (remove[i]) {
                continue;
            }

            for (int j = i * 2; j < remove.length; j += i) {
                remove[j] = true;
            }
        }


        for (int i = m; i <= n; i++) {
            if (remove[i]) {
                continue;
            }

            sb.append(i + "\n");
        }


        bw.write(sb.toString());
        bw.close();
    }
}

