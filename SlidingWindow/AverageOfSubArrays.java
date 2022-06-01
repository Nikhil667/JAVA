package SlidingWindow;

public class AverageOfSubArrays {
    public static void main(String[] args) {
        int[] arr = {-1};
        int k = 1;
        int i = 0;
        int j = 0;

        double sum = 0;
        double avg = 0;
        double max = (double) Integer.MIN_VALUE;

        while( j < arr.length){

            sum = sum + arr[j];

            if( (j-i) + 1 < k ){
                j++;
            }
            else if( (j-i) + 1 == k ){

                avg = sum / k;

                max = Math.max(max, avg);

                sum = sum - arr[i];

                i++;
                j++;

            }
            System.out.println("Max Average" + " " + max);
        }


    }
}
