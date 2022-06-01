package Miscellenous;

public class NegPosInPlace {
    public static void main(String[] args) {
        int[] arr = { 9, 3, 2, -6, 11, 6, -1};

        int[] newarr = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] > 0) {
                newarr[count++] = arr[i];
            }
        }

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] < 0) {
                newarr[count++] = arr[i];
            }
        }

        for (int k = 0; k < newarr.length; k++) {
            System.out.print(newarr[k] + " ");
        }

//        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
//
//        while( i < arr.length ){
//            if( arr[i] > 0 ){
//                hs.add(arr[i]);
//            }
//            if (arr[j] < 0 ){
//                hs.add(arr[i]);
//            }
//            i++;
//            j--;
//        }
//        System.out.println(hs);
    }
}
