package SlidingWindow;

public class LargestSubArrayWithSum {
    public static void main(String[] args) {
        int[] arr = {-5, 8, -14, 2, 4, 12};
        int i = 0;
        int j = 0;

        int sum = 0;
        int maxi = Integer.MIN_VALUE;

        int k = -5; // given sum

        while(j < arr.length){

            sum += arr[j];

            while( sum <= k ){
                maxi = Math.max(maxi, j-i+1);
                sum = sum - arr[i];
                i++;
            }
            j++;
        }
        System.out.println(maxi);
    }
}
