package Array;

import java.util.Scanner;

public class ArrayIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int element = s.nextInt();
        int insertElementIndex = s.nextInt();

        int[] arr = new int[size-1];
        for( int i=0; i<arr.length; i++){
            arr[i] = s.nextInt();
        }

        int[] arrNew = new int[size];

        for( int i=0; i<insertElementIndex; i++){
            arrNew[i] = arr[i];
        }

        arrNew[insertElementIndex] = element;

        for( int i=insertElementIndex+1; i<arrNew.length; i++){
            arrNew[i] = arr[i-1];
        }

        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + " ");
        }
    }
}
