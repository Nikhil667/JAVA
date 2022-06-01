package SlidingWindow;

public class AverageOptimize {
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 15, 5};
        int k = 4;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int max = sum;

        for (int j = 0; j < arr.length - k; j++) {
            sum = sum - arr[j] + arr[j + k];
            if( sum > max){
                max = sum;
            }
        }
        System.out.println(max/k);
        //System.out.println((double)(max/k));
    }

}
