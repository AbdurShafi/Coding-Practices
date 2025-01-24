public class FindGCD {
    public int findGCDs(int num1, int num2){
        if(num1==0){
           return num2;
        }
        else{
            return findGCDs(num2%num1,num1);
        }
    }
}
