import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
//        int[] array = new int[N+1];
//
//        array[0] = 0;
//        array[1] = 1;
//
//        for (int i = 2; i < N+1; i++) {
//            array[i] = array[i - 1] + array[i-2];
//            System.out.println("array[" + i +"] = " + array[i]);
//        }

        System.out.println(fibonacci(N));

    }

    static int fibonacci(int n) {

        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n-2) + fibonacci(n-1);
    }

}
