import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int target = 1;

        Stack<Integer> waitLine = new Stack<>();

        for (int i = 0; i < N; i++) {
            int currentPerson = sc.nextInt();

            while (!waitLine.isEmpty() && waitLine.peek() == target) {
                waitLine.pop();
                target++;
            }

            if (currentPerson == target) {
                target++;
            } else {
                if (!waitLine.isEmpty() && waitLine.peek() < currentPerson) {
                    System.out.println("Sad");
                    return;
                }

                waitLine.push(currentPerson);
            }
        }

        while (!waitLine.isEmpty() && waitLine.peek() == target) {
            waitLine.pop();
            target++;
        }

        if (waitLine.isEmpty()) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }

        sc.close();
    }
}