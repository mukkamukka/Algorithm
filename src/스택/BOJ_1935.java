package 스택;

/* https://www.acmicpc.net/problem/1935 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Stack<Double> stack = new Stack<>();
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 64 && str.charAt(i) < 91) {
                stack.push(arr[str.charAt(i) - 65]);
            } else {
                double fisrtNum = stack.pop();
                double secondNum = stack.pop();
                switch (str.charAt(i)) {
                    case '+':
                        stack.push(fisrtNum + secondNum);
                        break;
                    case '-':
                        stack.push(secondNum - fisrtNum);
                        break;
                    case '*':
                        stack.push(fisrtNum * secondNum);
                        break;
                    case '/':
                        stack.push(secondNum / fisrtNum);
                        break;
                }
            }
        }
        System.out.print(String.format("%.2f", stack.pop()));
    }
}
