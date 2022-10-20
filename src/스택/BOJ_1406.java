package 스택;

/* https://www.acmicpc.net/problem/1406 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());
        Stack<String> stackOne = new Stack<>();
        Stack<String> stackTwo = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stackOne.push(String.valueOf(str.charAt(i)));
        }

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String control = st.nextToken();

            switch (control) {
                case "L":
                    if (stackOne.empty()) {
                        break;
                    } else {
                        stackTwo.push(stackOne.pop());
                    }
                    break;
                case "D":
                    if (stackTwo.empty()) {
                        break;
                    } else {
                        stackOne.push(stackTwo.pop());
                    }
                    break;
                case "B":
                    if (stackOne.empty()) {
                        break;
                    } else {
                        stackOne.pop();
                    }
                    break;
                case "P":
                    String value = st.nextToken();
                    stackOne.push(value);
                    break;
            }
        }

        while (!stackTwo.empty()) {
            stackOne.push(stackTwo.pop());
        }
        while (!stackOne.empty()) {
            sb.append(stackOne.pop());
        }

        String output = sb.reverse().toString();
        System.out.println(output);
    }
}
