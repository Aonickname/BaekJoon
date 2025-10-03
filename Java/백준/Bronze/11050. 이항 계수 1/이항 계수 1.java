import java.util.*;
import java.io.*;

class Factorial{
    public int factorial(int n) {

        if (n <= 1) {
            return 1;
        }

        return n * factorial(n-1);
    }
}

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        Factorial fact = new Factorial();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        bw.write((fact.factorial(N)) / ((fact.factorial(K)) *(fact.factorial(N - K))) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}