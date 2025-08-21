import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();


        Set<String> sentences = new HashSet<>();

        for (int i = 1; i <= S.length(); i++) {

            for (int j = 0; j <= S.length() - i; j++) {
                String sub = S.substring(j, j + i);

                sentences.add(sub);
            }
        }

        System.out.println(sentences.size());

    }
}
