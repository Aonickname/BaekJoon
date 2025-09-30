import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int cnt = 0;

        Deque<Integer> permutation = new LinkedList<>();
        List<Integer> outputs = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            permutation.add(i);
        }

        while(!permutation.isEmpty()){

            for (int i = 1; i <= permutation.size(); i++) {
                cnt++;

                if (cnt % K == 0) {
//                    System.out.println(permutation.peek());
                    outputs.add(permutation.poll());

                } else {
                    permutation.addLast(permutation.poll());
                }

            }

        }

        outputs.add(permutation.poll());
        outputs.add(permutation.poll());
//        System.out.println(outputs);

        System.out.print("<");
        for (int i = 0; i < N; i++) {
            System.out.print(outputs.get(i));

            if(i != N-1)
                System.out.print(", ");
        }
        System.out.print(">");

    }
}