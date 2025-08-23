import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Set<String> hearnames = new HashSet<> ();
        Set<String> seenames = new HashSet<> ();

        for (int i = 0; i < N; i++) {
            hearnames.add(sc.next());
        }

        List<String> hearseenames = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            String names = sc.next();

            if (hearnames.contains(names)) {
                hearseenames.add(names);
            }
        }

        Collections.sort(hearseenames);

        System.out.println(hearseenames.size());

        for (String result : hearseenames) {
            System.out.println(result);
        }

    }
}