
// ReverseInteger without using String

public class ReverseInteger {
    public static void main(String arg[]){
        int num=1723459;
        int digit=0;
        int rev=0;
        while(num>0){
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println(rev);
        
    }
    
}
