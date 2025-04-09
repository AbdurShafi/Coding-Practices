package DynamicProgram;
import java.util.*;
public class HouseRobberDP {
    static int f(int n , int[] arr , int[] dp,int start){
        if(n==start){
            return arr[n];
        }
        if(n<start){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        int pick = arr[n] + f(n-2,arr,dp,start);
        int nonPick =  f(n-1,arr,dp,start);
        return dp[n] = Math.max(pick,nonPick);
    }
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        if(n==1) {
           System.out.println(arr[0]);
           return;
        }
        int[] dp = new int[n];
        int[] dp2  = new int[n];
        Arrays.fill(dp,-1);
        Arrays.fill(dp2,-1);
        int temp = Math.max(f(n-2,arr,dp,0),f(n-1,arr,dp2,1));
        System.out.println(temp);
    }
}
