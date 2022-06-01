package SlidingWindow;

public class SmallestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int i = 0;
        int j = 0;

        int sum = 0;
        int min = Integer.MAX_VALUE;

        int k = 7; // given sum

        while (j < arr.length){

            sum += arr[j];

            while( sum >= k ){

                min = Math.min(min, j-i+1);
                sum = sum - arr[i];
                i++;
            }
            j++;
        }
        System.out.println(min);
    }
}
