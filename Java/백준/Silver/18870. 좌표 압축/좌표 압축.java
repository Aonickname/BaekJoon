import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
 
        int[] array = new int[n];
        int[] arraySort = new int[n];
        HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();//압축할 map
 
        for(int i=0; i<n; i++){
            array[i] = arraySort[i] = sc.nextInt();
        }
 
        Arrays.sort(arraySort);
 

        int rank = 0;
 
        for(int value : arraySort){
            if(!rankMap.containsKey(value)){
                rankMap.put(value,rank);
                rank++;
            }
        }
 
        StringBuilder sb = new StringBuilder();
        for(int value : array){
            sb.append(rankMap.get(value)).append(' ');
        }
 
        System.out.println(sb);
    }
}