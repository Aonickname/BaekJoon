import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.close();
        
        int result = (int)Math.sqrt(N);
        System.out.println(result);
    }
}