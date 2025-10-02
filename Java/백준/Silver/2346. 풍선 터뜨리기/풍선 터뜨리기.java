import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Deque<int[]> papers = new ArrayDeque<>();
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();
            papers.add(new int[]{i + 1, input});
        }

        int[] currentBalloon = papers.poll();
        int move = currentBalloon[1];
        results.add(currentBalloon[0]);

        while (!papers.isEmpty()) {

            if (move > 0) {
                for (int j = 1; j < move; j++) {
                    papers.addLast(papers.poll());
                }

                currentBalloon = papers.poll();

            } else if (move < 0) {
                for (int j = 1; j < Math.abs(move); j++) {
                    papers.addFirst(papers.pollLast());
                }

                currentBalloon = papers.pollLast();
            }

            move = currentBalloon[1];
            results.add(currentBalloon[0]);
        }

        StringBuilder sb = new StringBuilder();
        for (int index : results) {
            sb.append(index).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}