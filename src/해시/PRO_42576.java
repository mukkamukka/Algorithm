package 해시;

/* https://school.programmers.co.kr/learn/courses/30/lessons/42576 */

import java.util.HashMap;
import java.util.Map;

public class PRO_42576 {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();

        for (String s : participant) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        for (String s : completion) {
            hm.put(s, hm.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        System.out.println(solution(participant, completion));
    }
}
