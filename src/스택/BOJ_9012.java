package 스택;

/* https://www.acmicpc.net/problem/9012 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            int strLength = str.length();
            boolean flag = true;

            for (int j = 0; j < strLength; j++) {
                if (str.charAt(j) == ')' && str.charAt(strLength-1) == '(') {
                    sb.append("NO\n");
                    flag = false;
                    break;
                }
                if (str.charAt(j) == '(') {
                    stack.push(str.charAt(j));
                } else {
                    if (stack.empty()) {
                        sb.append("NO\n");
                        flag = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (flag) {
                if (stack.empty()) {
                    sb.append("YES\n");
                } else {
                    sb.append("NO\n");
                }
            }
        }
        System.out.print(sb);
    }
}
