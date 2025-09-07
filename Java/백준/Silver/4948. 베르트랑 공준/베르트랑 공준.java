import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();

            if(num == 0) {
                break;
            }

            int cnt = 0;
            for (int i = num + 1; i <= num * 2; i++) {

                boolean isPrime = true;
                for (int j = 2; j <= i / j; j++) {

                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    cnt++;
                }
            }

            System.out.println(cnt);

        }

        sc.close();
    }
}