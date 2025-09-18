import java.util.Scanner;

public class Main {

    public static boolean[] isPrime = new boolean[1000001];

    public static void sieve() {
        for (int i = 2; i <= 1000000; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= 1000000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        sieve();

        int T = sc.nextInt();

        while(T-- > 0) {
            int N = sc.nextInt();
            int count = 0;

            for (int i = 2; i <= N / 2; i++) {
                if (isPrime[i] && isPrime[N - i]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }

        System.out.println(sb);
        sc.close();
    }
}