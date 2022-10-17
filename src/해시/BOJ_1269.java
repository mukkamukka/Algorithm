package 해시;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ_1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int count = 0;

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            hm.put(st.nextToken(), 1);
        }

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            String str = st.nextToken();
            hm.put(str, hm.getOrDefault(str, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
