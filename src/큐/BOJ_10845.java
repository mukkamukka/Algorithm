package 큐;

/* https://www.acmicpc.net/problem/10845 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int num;
        int lastNum = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();

            switch (str) {
                case "push":
                    num = Integer.parseInt(st.nextToken());
                    lastNum = num;
                    queue.add(num);
                    break;
                case "pop":
                    if (queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(queue.poll() + "\n");
                    }
                    break;
                case "size":
                    sb.append(queue.size() + "\n");
                    break;
                case "empty":
                    if (queue.isEmpty()) {
                        sb.append(1 + "\n");
                    } else {
                        sb.append(0 + "\n");
                    }
                    break;
                case "front":
                    if (queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(queue.peek() + "\n");
                    }
                    break;
                case "back":
                    if (queue.isEmpty()) {
                        sb.append(-1 + "\n");
                    } else {
                        sb.append(lastNum + "\n");
                    }
                    break;
                default:
                    break;
            }
        }

        bw.write(sb.toString());
        bw.close();
    }
}
