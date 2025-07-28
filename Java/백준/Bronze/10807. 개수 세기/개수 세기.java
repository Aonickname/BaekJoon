import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int N = 0;
        int V = 0;
        int count = 0;

        Scanner in = new Scanner(System.in);


        N = in.nextInt();
        int[] nums = new int[N];

        for(int i = 0; i < N; i++){
            nums[i] = in.nextInt();
        }

        V = in.nextInt();

        for(int i = 0; i < N; i++){
            if(nums[i] == V){
                count++;
            }
        }

        System.out.println(count);

    }
}