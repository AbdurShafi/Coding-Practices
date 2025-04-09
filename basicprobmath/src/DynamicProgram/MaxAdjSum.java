package DynamicProgram;
import java.util.*;

public class MaxAdjSum {
    static int f(int n , int[] arr , int[] dp){
        if(n==0){
            return arr[n];
        }
        if(n<0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int pick = arr[n] + f(n-2,arr,dp);
        int nonPick =  f(n-1,arr,dp);
        return dp[n] = Math.max(pick,nonPick);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(f(n-1,arr,dp));

    }
}
