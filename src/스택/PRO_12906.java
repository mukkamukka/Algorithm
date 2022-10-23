package 스택;

/* https://school.programmers.co.kr/learn/courses/30/lessons/12906 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

public class PRO_12906 {
    public static int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> answerList = new ArrayList<>();
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (stack.empty()) {
                stack.push(arr[i]);
                continue;
            }
            if (stack.peek() == arr[i]) {
                stack.pop();
                stack.push(arr[i]);
            } else {
                answerList.add(stack.pop());
                stack.push(arr[i]);
                cnt++;
            }
        }

        if (!stack.empty()) {
            answerList.add(stack.pop());
        }

        int[] answer = answerList.stream()
                .mapToInt(Integer::intValue)
                    .toArray();
        return answer;
    }

    public static void main(String[] args) throws IOException {
        int[] arr = {1,1,3,3,0,1,1};
        for (int i : solution(arr)) {
            System.out.print(i);
        }
    }
}
