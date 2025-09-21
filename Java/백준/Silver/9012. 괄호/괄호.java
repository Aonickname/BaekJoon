import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String input = sc.nextLine();
            Stack<Character> stack = new Stack<>();
            boolean isVPS = true;

            for (int j = 0; j < input.length(); j++) {
                char ch = input.charAt(j);

                if (ch == '(') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.empty()) {
                        isVPS = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }

            if (isVPS && stack.empty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}