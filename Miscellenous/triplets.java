package Miscellenous;
import java.util.*;
public class triplets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 5;//s.nextInt();
        int sum = 4; //s.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> h = new HashSet<>();
            for (int j = i+1; j < arr.length; j++) {
                int k = 1 - (arr[i] + arr[j]);
                if( h.contains(k) ){
                    System.out.println(arr[i] + " " + arr[j] + " " + k);
                }else{
                    h.add( arr[j] );
                }
            }
        }
    }
}
