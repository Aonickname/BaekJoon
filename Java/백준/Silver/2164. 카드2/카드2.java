import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Deque<Integer> cards = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            cards.add(i);
        }

        while (cards.size() != 1) {
            cards.remove();
            int temp = cards.pollFirst();
            cards.addLast(temp);
        }

        bw.write(cards.poll() + "");
        bw.flush();

    }
}