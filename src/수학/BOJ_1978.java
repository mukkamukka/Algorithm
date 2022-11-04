package 수학;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            boolean flag = true;
            if (num == 1) {
                continue;
            }
            for (int j = 2; j * j <= num; j++) {
                if (num % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));
        bw.close();
    }
}
