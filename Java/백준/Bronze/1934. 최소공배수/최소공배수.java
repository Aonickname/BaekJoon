import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int remain = 0;
            int GCD = 0;
            int a, b;

            if(A > B){
                a = A;
                b = B;
            }else{
                a = B;
                b = A;
            }

            while(b != 0){
                remain = a % b;
                a = b;
                b = remain;
            }
            GCD = a;

            System.out.println((A*B) / GCD);
        }

    }
}