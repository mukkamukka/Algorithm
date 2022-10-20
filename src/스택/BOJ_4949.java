package 스택;

/* https://www.acmicpc.net/problem/4949 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) {
                break;
            }
            boolean flag = true;
            Stack<Character> stack = new Stack<>();

            loop:
            for (int i = 0; i < str.length(); i++) {
                switch (str.charAt(i)) {
                    case '(':
                    case '[':
                        stack.push(str.charAt(i));
                        break;
                    case ')':
                        if (stack.empty() || stack.peek().equals('[')) {
                            sb.append("no\n");
                            flag = false;
                            break loop;
                        } else {
                            stack.pop();
                        }
                        break;
                    case ']':
                        if (stack.empty() || stack.peek().equals('(')) {
                            sb.append("no\n");
                            flag = false;
                            break loop;
                        } else {
                            stack.pop();
                        }
                        break;
                }
            }
            if (!flag) {
                continue;
            }
            if (stack.empty()) {
                sb.append("yes\n");
            } else {
                sb.append("no\n");
            }
        }
        System.out.println(sb);
    }
}
