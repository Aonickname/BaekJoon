import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        HashMap<Integer, String> numToName = new HashMap<>();
        HashMap<String, Integer> nameToNum = new HashMap<>();


        for (int i = 0; i < N; i++) {
            String name = sc.next();
            numToName.put(i + 1, name);
            nameToNum.put(name, i + 1);
        }

        for (int i = 0; i < M; i++) {
            if(sc.hasNextInt()){
                int num = sc.nextInt();
                System.out.println(numToName.get(num));
            }else{
                String name = sc.next();
                System.out.println(nameToNum.get(name));
            }
        }

        sc.close();
    }
}