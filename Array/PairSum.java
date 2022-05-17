package Array;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        //for sum of pair
        for (int i = 0; i < size-1; i++) {
            int pair = arr[i] + arr[i+1];
            i++;
            //System.out.println(i);
            System.out.print(pair + " ");
        }
    }
}
