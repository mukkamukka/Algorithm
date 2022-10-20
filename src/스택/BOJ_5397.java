package 스택;

/* https://www.acmicpc.net/problem/5397 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String str = br.readLine();
            Stack<Character> left = new Stack<>();
            Stack<Character> right = new Stack<>();

            for (int j = 0; j < str.length(); j++) {
                switch (str.charAt(j)) {
                    case '<':
                        if (!left.empty()) {
                            right.push(left.pop());
                        }
                        break;
                    case '>':
                        if (!right.empty()) {
                            left.push(right.pop());
                        }
                        break;
                    case '-':
                        if (!left.empty()) {
                            left.pop();
                        }
                        break;
                    default:
                        left.push(str.charAt(j));
                        break;
                }

            }
            while (!right.empty()) {
                left.push(right.pop());
            }
            while (!left.empty()) {
                sb.append(left.pop());
            }
            arr[i] = sb.reverse().toString();
        }
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
