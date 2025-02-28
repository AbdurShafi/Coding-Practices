package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LeaderFind {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        int max = arr[n-1];
        ans.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i] > max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        for(int m : ans){
            System.out.println(m);
        }
    }
}
