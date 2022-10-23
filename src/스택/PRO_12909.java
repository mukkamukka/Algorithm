package 스택;

/* https://school.programmers.co.kr/learn/courses/30/lessons/12909 */

import java.util.Stack;

public class PRO_12909 {
    public static boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (stack.empty()) {
                if (s.charAt(i) == ')') {
                    answer = false;
                    break;
                } else {
                    stack.push(s.charAt(i));
                }
            } else {
                if (s.charAt(i) == '(') {
                    stack.push(s.charAt(i));
                } else {
                    stack.pop();
                }
            }
        }

        if (!stack.empty()) {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "(()(";
        System.out.println(solution(s));
    }
}
