import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        for (int i = N; i <= M; i++) {

            if (i == 1) {
                continue;
            }

            boolean isPrime = true;
            for (int j = 2; j <= i / j; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }

        }
    }
}