package 해시;

/* https://www.acmicpc.net/problem/2002 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_2002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();
        int count = 0;
        Integer[] arr = new Integer[n];

        for (int i = 0; i < n; i++) {
            hm.put(br.readLine(), i);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = hm.get(br.readLine());
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
