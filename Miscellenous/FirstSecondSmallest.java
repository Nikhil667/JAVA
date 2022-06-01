package Miscellenous;

public class   FirstSecondSmallest {
    public static void main(String[] args) {
        int[] arr = { 1,21,1,10,4,5,23};

        int second = Integer.MAX_VALUE;
        int first = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < first){
                second = first;
                first = arr[i];
            }
            else if ( arr[i] < second && arr[i] != first){
                second = arr[i];
            }
        }
        System.out.println(first +  " " + second);
    }
}
