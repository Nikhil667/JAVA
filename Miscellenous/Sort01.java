package Miscellenous;

public class Sort01 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,1,0,0,0,1};
//        int[] newarr = new int[arr.length];
//        int count = 0;
//
//        for (int i = 0; i < arr.length ; i++) {
//            if (arr[i] > 0) {
//                newarr[count++] = arr[i];
//            }
//        }
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(newarr[i]);
//        }

        int first = 0;
        int last = arr.length-1;

        while(first <= last){

            if( arr[first] == 1 && arr[last] != 1) {
                int temp = arr[first];
                arr[first] = arr[last];
                arr[last] = temp;
                first++;
                last--;
            }
            else if(arr[first] == 0){
                first++;
            }
//            else{
//                int temp = arr[mid];
//                arr[mid] = arr[last];
//                arr[last] = temp;
//                last--;
//            }
        }
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
        }
    }
}
