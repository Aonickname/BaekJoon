import java.util.*;

public class Main{
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

        int N = sc.nextInt();

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int m = sc.nextInt();
            nums.add(m);
        }

        Collections.sort(nums);

        int finalGCD = nums.get(1) - nums.get(0);
        for (int i = 2; i < nums.size(); i++) {
            int currentGap = nums.get(i) - nums.get(i - 1);
            finalGCD = GCD(finalGCD, currentGap);

        }

        System.out.println(((nums.get(nums.size() - 1) - nums.get(0)) / finalGCD + 1) - N);

    }
}