public class ReverseNum {
   public void reverseNum(int num){
       int s =0;
       while(num!=0){
           int n = s*10;
           s = n+num%10;
           num = num/10;
       }
       System.out.println(s);
   }
}
