package 스택;

/* https://www.acmicpc.net/problem/1874 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        int cnt = 1;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            for (int j = cnt; j <= num; j++) {
                stack.push(cnt);
                cnt++;
                sb.append("+\n");
            }
            if (stack.peek() == num) {
                stack.pop();
                sb.append("-\n");
            }
        }
        if (!stack.empty()) {
            sb = new StringBuilder("NO");
        }
        System.out.println(sb);


    }
}
