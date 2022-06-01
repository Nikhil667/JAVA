package Miscellenous;

import java.util.Scanner;

public class DontCountDuplcates {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = s.nextInt();
        }
        int count = 1;
        for (int i = 0; i < size-1; i++) {
            if ( arr[i] == arr[i+1] ){

            }else{
                count++;
            }
        }
        System.out.println(count);
    }
}
