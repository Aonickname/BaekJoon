import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> nums = new ArrayList<>();

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        for (int i = 0; i < N; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(nums);
        long result = (long) nums.get(0) * nums.get(N - 1);

        bw.write(result + "\n");

        br.close();
        bw.flush();
        bw.close();

    }
}