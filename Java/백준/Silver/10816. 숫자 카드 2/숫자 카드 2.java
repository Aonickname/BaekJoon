import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        HashMap<Integer, Integer> cardMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int card = sc.nextInt();
            cardMap.put(card, cardMap.getOrDefault(card, 0) + 1);
        }

        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int findNum = sc.nextInt();

            sb.append(cardMap.getOrDefault(findNum, 0)).append(" ");
        }

        System.out.println(sb.toString());

        sc.close();
    }
}