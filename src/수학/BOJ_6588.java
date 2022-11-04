package 수학;

/* https://www.acmicpc.net/problem/6588 */

import java.io.*;

public class BOJ_6588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        boolean[] prime = new boolean[1000001];

        prime[0] = true;
        prime[1] = true;
        prime[2] = true;

        for (int i = 2; i < prime.length; i++) {
            if (prime[i]) {
                continue;
            }

            for (int j = i * 2; j < prime.length; j += i) {
                prime[j] = true;
            }
        }

        while (true) {
            int n = Integer.parseInt(br.readLine());
            boolean flag = true;

            if (n == 0) {
                break;
            }

            for (int i = 0; i < n; i++) {
                if (prime[i]) {
                    continue;
                }

                if (!prime[n - i]) {
                    sb.append(n + " = " + i + " + " + (n - i) + "\n");
                    flag = false;
                    break;
                }
            }

            if (flag) {
                sb.append("Goldbach's conjecture is wrong.");
            }
        }

        bw.write(sb.toString());
        bw.close();
    }
}
