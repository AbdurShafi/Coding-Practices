public class CountDigit {
    public void countDigits(int num){
        int count=0;
       while(num!=0){
           num = num/10;
           count++;
       }
        System.out.println(count);
    }
}
