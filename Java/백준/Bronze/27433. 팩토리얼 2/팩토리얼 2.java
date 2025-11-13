import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        System.out.println(Factorial(N));
    }

    static long Factorial(int n) {

        if(n <= 1)
            return 1;
        else
            return Factorial(n-1) * n;
    }
}
