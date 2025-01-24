public class PerfectNumber {
    public void isPerfectNum(int num) {
        int sum  = 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if ((num / i) == i) {
                    sum += i;
                }
                else{
                    sum += num/i+i;
                }
            }
        }
        if(sum == num){
            System.out.println("It is a Perfect Number");
        }
        else{
            System.out.println("Sorry !! It Is Not");
        }
    }
}
