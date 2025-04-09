package DynamicProgram;
import java.util.*;
public class FibanacciDP {
    public static int f(int n,int[] dp){
        if(n<=1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = f(n-1,dp)+f(n-2,dp);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n+1];
        Arrays.fill(arr,-1);
        System.out.println(f(n,arr));
    }
}
