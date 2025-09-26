import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String sentence = br.readLine();

            Stack<Character> parentheses = new Stack<>();

            if (sentence.equals(".")) {
                break;
            }
            boolean yesOrno = true;

            for (int i = 0; i < sentence.length(); i++) {
                char check = sentence.charAt(i);

                if (parentheses.empty() && (check == ')' || check == ']')) {
                    yesOrno = false;
                    break;
                }

                if (check == '(') {
                    parentheses.push(check);
                }
                if (!parentheses.empty() && check == ')' && parentheses.peek() == '(') {
                    parentheses.pop();
                } else if (check == ')' && parentheses.peek() == '[') {
                    yesOrno = false;
                    break;
                }


                if (check == '[') {
                    parentheses.push(check);
                }

                if (!parentheses.empty() && check == ']' && parentheses.peek() == '[') {
                    parentheses.pop();
                } else if (check == ']' && parentheses.peek() == '(') {
                    yesOrno = false;
                    break;
                }
            }

            if (parentheses.empty() && yesOrno) {
                System.out.println("yes");
            }else
                System.out.println("no");


            bw.flush();
        }


        br.close();

    }
}