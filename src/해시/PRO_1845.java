package 해시;

/* https://school.programmers.co.kr/learn/courses/30/lessons/1845 */

import java.util.HashMap;

public class PRO_1845 {
    public static int solution(int[] nums) {
        int answer = 0;
        int num = nums.length/2;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], 1);
        }
        if(num >= hm.keySet().size()){
            answer = hm.keySet().size();
        } else {
            answer = num;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,5,6};

        System.out.println(solution(arr));
    }
}

