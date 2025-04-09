package DynamicProgram;
import java.util.*;
public class FrogJumpDP {
    static int f(int n,int[] arr,int[] dp){
        if(n==0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int  left = f(n-1,arr,dp)+Math.abs(arr[n] - arr[n-1]);
        int right = Integer.MAX_VALUE;
        if(n>1){
            right = f(n-2,arr,dp)+Math.abs(arr[n] - arr[n-2]);
        }


        return dp[n] = Math.min(left,right);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(f(n-1,arr,dp));

    }
}
