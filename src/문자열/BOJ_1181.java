package 문자열;

/* https://www.acmicpc.net/problem/1181 */


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class BOJ_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> al = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            al.add(br.readLine());
        }

        Collections.sort(al, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                else {
                    return o1.length() - o2.length();
                }
            }
        });

        sb.append(al.get(0) + "\n");

        for (int i = 1; i < n; i++) {
            if (!al.get(i).equals(al.get(i - 1))) {
                sb.append(al.get(i) + "\n");
            }
        }
        bw.write(sb.toString());
        bw.close();
    }
}
