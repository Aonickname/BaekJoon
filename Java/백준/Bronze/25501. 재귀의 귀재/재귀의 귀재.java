import java.util.*;
import java.io.*;

public class Main{
    static int count = 0;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            count = 0;
            bw.write(isPalindrome(br.readLine()) + " " + count + "\n");
        }


        br.close();
        bw.flush();
        bw.close();
    }

    static int isPalindrome(String input) {


        return recursion(input, 0, input.length()-1);

    }

    static int recursion(String input, int l, int r) {
        count++;

        if(l >= r) return 1;
        else if(input.charAt(l) != input.charAt(r)) return 0;
        else return recursion(input, l + 1, r - 1);

    }
}