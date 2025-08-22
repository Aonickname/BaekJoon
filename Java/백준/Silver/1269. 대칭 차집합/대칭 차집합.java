import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();


        Set<Integer> As = new HashSet<>();
        Set<Integer> Bs = new HashSet<>();


        for (int i = 0; i < A; i++) {
            As.add(sc.nextInt());
        }

        for (int i = 0; i < B; i++) {
            Bs.add(sc.nextInt());
        }

        Set<Integer> diffAB = new HashSet<>(As);
        diffAB.removeAll(Bs);

        Set<Integer> diffBA = new HashSet<>(Bs);
        diffBA.removeAll(As);

        int result = diffAB.size() + diffBA.size();

        System.out.println(result);

    }
}