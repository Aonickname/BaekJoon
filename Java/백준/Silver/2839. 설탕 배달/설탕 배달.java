import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int count_5kg = 0, count_3kg = 0;

        count_5kg = N / 5;
        int left = N - 5 * count_5kg;

        while(count_5kg >= 0) {
            left = N - 5 * count_5kg;

            if(left % 3 == 0){
                count_3kg = left / 3;
                System.out.println(count_3kg + count_5kg);
                return;
            }

            count_5kg--;
        }
            System.out.println("-1");
    }
}
