package 스택;

/* https://www.acmicpc.net/problem/12605 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_12605 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<String> stack = new Stack<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = st.countTokens();
            for (int j = 0; j < num; j++) {
                stack.push(st.nextToken());
            }
            int stackSize = stack.size();
            System.out.print("Case #" + (i + 1) + ": ");
            for (int j = 0; j < stackSize; j++) {
                System.out.print(stack.pop() + " ");
            }
            System.out.print("\n");
        }

    }
}
