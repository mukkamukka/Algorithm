package 큐;

/* https://www.acmicpc.net/problem/2164 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }

        for (int i = 0; i < n; i++) {
            if (queue.size() == 1) {
                break;
            }
            queue.remove();
            queue.add(queue.poll());
        }

        bw.write(queue.peek().toString());
        bw.close();
    }
}
