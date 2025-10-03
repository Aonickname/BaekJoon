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

        Factorial fact = new Factorial();

        int N = Integer.parseInt(br.readLine());

        bw.write(fact.factorial(N) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}