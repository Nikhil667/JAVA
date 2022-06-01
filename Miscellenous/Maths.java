package Miscellenous;

public class Maths {
    public static void main(String[] args) {
        int[] arr = {2 ,1 , 3, 4};
        int k = 0;
        int maxele = 4;
        for (int i = 0; i < arr.length; i++) {
            arr[k] = arr[k] + (arr[i] % maxele) * maxele;
            k++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr.length-1; i++)
        {
            arr[i] = arr[i] / maxele;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
