import java.util.*;

class BinarySearch{
    static int binarySearch(int[] a, int n, int key){
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;
            if (a[pc] == key)
                return 1;
            else if (a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;
        } while (pl <= pr);

        return 0;
    }
}

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] cards1 = new int[N];

        for (int i = 0; i < N; i++) {
            cards1[i] = sc.nextInt();
        }

        Arrays.sort(cards1);

        int M = sc.nextInt();
        int[] cards2 = new int[M];

        for (int i = 0; i < M; i++) {
            cards2[i] = sc.nextInt();
        }

        for (int i = 0; i < M; i++) {
            int ky = cards2[i];

            int idx = BinarySearch.binarySearch(cards1, N, ky);
            System.out.print(idx + " ");
        }

    }
}