public class ArmstrongNumber {
    public void checkArmstrong(int num){
        double count=0;
        int dup = num;
        while(num!=0){
            int n = num%10;
            count += Math.pow(n,3);
            num = num/10;
        }
        if(dup == count){
            System.out.println("An Armstrong Number ");
        }
        else{
            System.out.println("Not An Armstrong Number ");
        }
    }
}
