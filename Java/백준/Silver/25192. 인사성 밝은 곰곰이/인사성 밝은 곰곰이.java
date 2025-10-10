import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int totalGomgomCount = 0;

        Set<String> nicknameSet = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String currentNickname = br.readLine();

            if (currentNickname.equals("ENTER")) {

                totalGomgomCount += nicknameSet.size();
                nicknameSet.clear();

            }
            else {
                nicknameSet.add(currentNickname);
            }
        }
        totalGomgomCount += nicknameSet.size();

        bw.write(totalGomgomCount + "\n");


        br.close();
        bw.flush();
        bw.close();
    }
}