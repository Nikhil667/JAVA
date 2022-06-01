package Miscellenous;

public class Sort012 {
    public static void main(String[] args) {
        int[] arr = {2,2,1,0,1,2,0,1};

        int first = 0;
        int mid =0;
        int last = arr.length-1;

        while(mid <= last){

            if( arr[mid] == 0) {
                int temp = arr[first];
                arr[first] = arr[mid];
                arr[mid] = temp;
                first++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[last];
                arr[last] = temp;
                last--;
            }

        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+ " ");
        }


    }
}
