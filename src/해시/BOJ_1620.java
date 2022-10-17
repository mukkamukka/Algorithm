package 해시;

/* https://www.acmicpc.net/problem/1620 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_1620 {
    public static boolean isStringNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] nameArr = new String[n + 1];
        HashMap<String, Integer> hm = new HashMap<>();

        for (int i = 1; i < n + 1; i++) {
            String name = br.readLine();
            hm.put(name, i);
            nameArr[i] = name;
        }

        for (int i = 0; i < m; i++) {
            String findStr = br.readLine();
            if (isStringNumber(findStr)) {
                int index = Integer.parseInt(findStr);
                sb.append(nameArr[index]);
            } else {
                sb.append(hm.get(findStr));
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
