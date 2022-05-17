package Array;

import java.util.Scanner;

public class ArrayFreq {
        public static void main(String[] args) {

            Scanner s =new Scanner(System.in);
            int size = s.nextInt();

            int[] arr = new int[size];

            int max = Integer.MIN_VALUE;

            for(int i=0; i<size; i++){
                arr[i] = s.nextInt();
                if(arr[i] > max){
                    max = arr[i];
                }
            }

            int[] count = new int[max+1];

            for(int i=0; i<size; i++){
                count[arr[i]]++;
            }
            for(int i=0; i<= count.length; i++) {
                if(count[i]>0)
                    System.out.println(i +" is occurs "+ count[i] + " times");
            }

        }
    }

