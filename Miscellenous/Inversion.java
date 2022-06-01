package Miscellenous;

import java.util.Scanner;

public class Inversion {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if( arr[i] > arr[j] ){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
