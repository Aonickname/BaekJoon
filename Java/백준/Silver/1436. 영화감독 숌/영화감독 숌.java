import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int count = 0;
        int M = 0;

        while(true){
            M++;

            if(Integer.toString(M).contains("666")){
                count++;
            }
            if(count == N){
                System.out.println(M);
                break;
            }
        }
    }
}