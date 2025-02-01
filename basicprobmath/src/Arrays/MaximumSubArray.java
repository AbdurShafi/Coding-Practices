package Arrays;
import java.util.*;

class MaximumSubArray1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int len=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int s=0;
                    s += arr[j];
                     if(s==r){
                         len=Math.max(len,j-i+1);
                     }
            }
        }
        System.out.println(len);
    }

}


class MaximumSubArray2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        
    }

}
