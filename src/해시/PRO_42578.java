package 해시;

/* https://school.programmers.co.kr/learn/courses/30/lessons/42578 */

import java.util.HashMap;

public class PRO_42578 {
    public static  int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);
        }
        for (int i : hm.values()) {
            answer = answer * (i + 1);
        }
        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
        System.out.println(solution(clothes));
    }
}
