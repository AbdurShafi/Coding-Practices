public class PalindromeNum {
    public int reverseNum(int num){
        int s =0;
        while(num!=0){
            int n = s*10;
            s = n+num%10;
            num = num/10;
        }
        return s;
    }
    public void checkPalindromeNum(int num){
        int rev = reverseNum(num);
        if(rev == num){
            System.out.println("WOw It Is A palindrome");
        }
        else{
            System.out.println("Not A Palindrome");
        }
    }
}
