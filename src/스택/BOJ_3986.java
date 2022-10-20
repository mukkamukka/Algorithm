package 스택;

/* https://www.acmicpc.net/problem/3986 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_3986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();
            for (int j = 0; j < str.length(); j++) {
                if (!stack.empty()) {
                    if (stack.peek() == str.charAt(j)) {
                        stack.pop();
                    } else {
                        stack.push(str.charAt(j));
                    }
                } else {
                    stack.push(str.charAt(j));
                }
            }
            if (stack.empty()) {
                count++;
            }
        }
        System.out.println(count);
    }
}
