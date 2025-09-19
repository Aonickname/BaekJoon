import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        List<Integer> money = new ArrayList<>();

        for (int i = 0; i < K; i++) {
            int N = sc.nextInt();

            if (N == 0) {
                if (!money.isEmpty()) {
                    money.remove(money.size() - 1);
                }
            }else{
                money.add(N);
            }

        }

        int sum = 0;

        for (int i = 0; i <= money.size() - 1; i++) {
            sum += (int) money.get(i);
        }

        System.out.println(sum);

    }
}