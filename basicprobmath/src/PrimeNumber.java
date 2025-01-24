public class PrimeNumber {
    public void checkPrime(int num){
        boolean flag = false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if((num%i)==0) {
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Not Prime Number");
        }
        else{
            System.out.println("Prime Number");
        }
    }
}
