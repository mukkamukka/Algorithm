package 큐;

/* https://www.acmicpc.net/problem/2161 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }

        for (int i = 0; i < n; i++) {
            sb.append(queue.poll() + " ");
            queue.add(queue.poll());
        }

        bw.write(sb.toString());
        bw.close();
    }
}
