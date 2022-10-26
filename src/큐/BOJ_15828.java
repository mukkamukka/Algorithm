package 큐;

/* https://www.acmicpc.net/problem/15828 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_15828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == -1) {
                break;
            } else if (num == 0) {
                queue.remove();
            } else {
                if (queue.size() != n) {
                    queue.add(num);
                }
            }
        }
        if (queue.isEmpty()) {
            sb.append("empty");
        } else {
            while (!queue.isEmpty()) {
                sb.append(queue.poll() + " ");
            }
        }

        bw.write(sb.toString());
        bw.close();
    }
}
