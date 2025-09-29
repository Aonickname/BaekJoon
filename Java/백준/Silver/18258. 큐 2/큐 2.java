import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> Queue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");

            if (input.contains("push")) {
                st.nextToken();
                Queue.add(Integer.parseInt(st.nextToken()));
            }
            if (input.contains("pop")) {
                Integer poppedValue = Queue.poll();

                if (poppedValue == null) {
                    bw.write("-1\n");
                } else {
                    bw.write(poppedValue + "\n");
                }

            }
            if (input.equals("size")) {
                bw.write(Queue.size() + "\n");
            }
            if (input.equals("empty")) {

                if (Queue.isEmpty()) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            }
            if (input.equals("front")) {
                if (Queue.isEmpty()) {
                    bw.write("-1\n");
                } else {
                    bw.write(Queue.element() + "\n");
                }
            }
            if (input.equals("back")) {
                Integer checkBack = Queue.peekLast();

                if (checkBack == null) {
                    bw.write("-1\n");
                } else {
                    bw.write(checkBack + "\n");
                }
            }

        }

        bw.flush();

    }
}