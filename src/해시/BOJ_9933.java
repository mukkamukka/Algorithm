package 해시;

/* https://www.acmicpc.net/problem/9933 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_9933 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        HashMap<String, String> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder(str);
            String revStr = sb.reverse().toString();
            if (str.equals(revStr)) {
                stringBuilder.append(str.length() + " ");
                stringBuilder.append(str.charAt(((str.length() + 1) / 2) - 1));
                break;
            }
            if (!hm.containsKey(revStr)) {
                hm.put(str, revStr);
            } else {
                stringBuilder.append(str.length() + " ");
                stringBuilder.append(str.charAt(((str.length() + 1) / 2) - 1));
                break;
            }
        }
        System.out.print(stringBuilder);
    }
}
