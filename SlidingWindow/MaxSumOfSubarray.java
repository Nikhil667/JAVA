package SlidingWindow;

public class MaxSumOfSubarray {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 1, 3, 2 };

        int i = 0;
        int j = 0;
        int sum = 0;
        int max1 = Integer.MIN_VALUE;

        int k = 3; //window size

        while( j < arr.length ){

            sum = sum + arr[j];

            if( ((j - i) + 1) < k){
                j++;
            }
            else if( ((j - i) + 1) == k) {

                max1 = Math.max(max1, sum);

                sum = sum - arr[i];

                i++;
                j++;

            }

        }
        System.out.println(max1);
    }
}
