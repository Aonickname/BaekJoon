import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Set<String> arrSet = new HashSet<>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            arrSet.add(sc.next());
        }

        String temp;

        for (int j = 0; j < M; j++) {
            temp = sc.next();
            if (arrSet.contains(temp)) {
                cnt++;
            }
        }

        System.out.print(cnt);

    }
}