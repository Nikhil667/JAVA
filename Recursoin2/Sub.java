package Recursoin2;

import java.util.*;

public class Sub {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while( t > 0){

            int n = s.nextInt();
            int[] arr = new int[n];
            for( int i=0; i<n; i++ ){
                arr[i] = s.nextInt();
            }
            System.out.println(solve(arr, n));

            t--;
        }
    }
    public static List<ArrayList<Integer>> solve (int[] arr, int n){
        List<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ans.add(new ArrayList<Integer>());
        for (int i = 0; i < n; i++) {
            List<ArrayList<Integer>> newSubset = new ArrayList<>();
            for (ArrayList<Integer> set : ans ){
                ArrayList<Integer> newSet = new ArrayList<Integer>();
                newSet.addAll(set);
                newSet.add(arr[i]);
                newSubset.add(newSet);
            }
            for (ArrayList<Integer> temp : newSubset ){
                ans.add(temp);
            }
        }
        return ans;
    }
}
