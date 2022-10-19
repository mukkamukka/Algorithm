package 해시;

/* https://school.programmers.co.kr/learn/courses/30/lessons/42577 */

import java.util.Arrays;
import java.util.HashMap;

public class PRO_42577 {
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        HashMap<Integer, String> hm = new HashMap<>();
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length; i++) {
            hm.put(i, phone_book[i]);
        }
        for (int i = 0; i < phone_book.length; i++) {
            if (i == phone_book.length - 1) {
                break;
            }
            if (phone_book[i + 1].startsWith(hm.get(i))) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] phone_book = {"12","123","1235","567","88"};
        System.out.println(solution(phone_book));
    }
}
