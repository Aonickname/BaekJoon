import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();



        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());

            if (order == 1) {
                int X = Integer.parseInt(st.nextToken());
                stack.push(X);
            }
            if (order == 2) {
                if (stack.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack.pop() + "\n");
                }
            }
            if (order == 3) {
                bw.write(stack.size() + "\n");
            }
            if (order == 4) {
                if (stack.isEmpty())
                    bw.write("1\n");
                else
                    bw.write("0\n");
            }
            if (order == 5) {
                if (stack.isEmpty())
                    bw.write("-1\n");

                else
                    bw.write(stack.peek() + "\n");
            }

        }
        bw.flush();
        br.close();
        bw.close();
    }
}