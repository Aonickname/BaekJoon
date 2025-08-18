import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, String> inout = new HashMap<>();

        for (int i = 0; i < n; i++) {
            inout.put(sc.next(), sc.next());
        }

        List<String> leftMembers = new ArrayList<>();

        for (Map.Entry<String, String> entry : inout.entrySet()) {
            if (entry.getValue().equals("enter")) {
//                System.out.println("키: " + entry.getKey() + ", 값: " + entry.getValue());
                leftMembers.add(entry.getKey());
            }
        }

        Collections.sort(leftMembers, Collections.reverseOrder());

        for (String member : leftMembers) {
            System.out.println(member);
        }
    }
}
