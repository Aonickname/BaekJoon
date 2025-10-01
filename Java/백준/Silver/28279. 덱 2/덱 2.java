import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> results = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            String command = st.nextToken();

            switch(command) {
                case "1":
                    results.addFirst(Integer.parseInt(st.nextToken()));
                    break;

                case "2":
                    results.addLast(Integer.parseInt(st.nextToken()));
                    break;

                case "3":
                    Integer temp3 = results.poll();

                    if (temp3 != null)
                        bw.write(temp3 + "\n");
                    else
                        bw.write("-1\n");
                    break;

                case "4":
                    Integer temp4 = results.pollLast();

                    if (temp4 != null)
                        bw.write(temp4 + "\n");
                    else
                        bw.write("-1\n");
                    break;

                case "5":
                    bw.write(results.size() + "\n");
                    break;

                case "6":
                    if(!results.isEmpty())
                        bw.write("0\n");
                    else
                        bw.write("1\n");
                    break;

                case "7":
                    Integer temp7 = results.peek();

                    if (temp7 != null)
                        bw.write(temp7 + "\n");
                    else
                        bw.write("-1\n");
                    break;

                case "8":
                    Integer temp8 = results.peekLast();

                    if (temp8 != null)
                        bw.write(temp8 + "\n");
                    else
                        bw.write("-1\n");
                    break;

            }
        }

        bw.flush();
    }
}