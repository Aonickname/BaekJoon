import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        for (long i = 0; i < n; i++) {
            long num = sc.nextLong();

            while (true) {
                if (num <= 1) {
                    num++;
                    continue;
                }

                boolean isPrime = true;
                for (long j = 2; j <= num / j; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(num);
                    break;
                }
                num++;
            }
        }
        sc.close();
    }
}