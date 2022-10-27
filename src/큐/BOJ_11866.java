package 큐;

/* https://www.acmicpc.net/problem/11866 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }

        for (int i = 0; i < n; i++) {
            if (queue.size() == 1) {
                sb.append(queue.poll() + ">");
                break;
            }
            for (int j = 0; j < m; j++) {
                if (j == m - 1) {
                    sb.append(queue.poll() + ", ");
                } else {
                    queue.add(queue.poll());
                }
            }
        }

        bw.write("<" + sb.toString());
        bw.close();
    }
}
