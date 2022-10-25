package 문자열;

/* https://www.acmicpc.net/problem/2675 */

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < num; k++) {
                    sb.append(str.charAt(j));
                }
            }
            bw.write(sb.toString() + "\n");
        }
        bw.close();

    }
}
