public class FactorOfNum {
    public void findfactor(int num) {
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if ((num / i) == i) {
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i+" "+num/i+" ");
                }
            }
        }
    }
}
