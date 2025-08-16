import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Member member;

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Member[] members = new Member[N];

        for (int i = 0; i < N; i++) {
            int year = sc.nextInt();
            String name = sc.next();
            members[i] = new Member(year, name);
        }

        Arrays.sort(members, (a, b) -> a.year - b.year);


        for(Member m : members){
            System.out.println(m.year + " " + m.name);
        }

    }
}

class Member{
    int year;
    String name;

    Member(int year, String name){
        this.year = year;
        this.name = name;
    }
}