package Array;

public class MaxMinPair {
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,5,1};

        int sum = 0;
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            sum += arr[i] + arr[i+1];
            if( sum < minSum){
                minSum = sum;
            }
            if( sum > maxSum){
                maxSum = sum;
            }
            i++;
            sum=0;
        }
        System.out.println(maxSum + " " + minSum);
    }
}
