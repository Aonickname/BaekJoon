import java.util.*;
import java.io.*;


public class Main {
    static long[][] dp = new long[31][31];

    public static void pasCal(int maxM) {

        for (int i = 0; i <= maxM; i++) {
            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        pasCal(30);

        long T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");

            long N = Integer.parseInt(st.nextToken());
            long M = Integer.parseInt(st.nextToken());

            bw.write(dp[(int)M][(int)N] + "\n");

        }

        bw.flush();
        bw.close();
        br.close();
    }
}