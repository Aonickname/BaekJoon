import java.util.*;

public class Main {
    public static int GCD(int A, int B) {

        while (B != 0) {
            int temp = A % B;
            A = B;
            B = temp;
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int numerator = A * D + C * B;
        int denominator = B * D;

        int gcdValue = GCD(numerator, denominator);
        System.out.print( numerator / gcdValue + " ");
        System.out.print( denominator / gcdValue);

    }
}