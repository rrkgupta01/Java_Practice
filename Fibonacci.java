import java.util.Scanner;
class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
    System.out.println("Fibonacci series up to " + num + " terms:");
        for(int i=0;i<num;i++){
            System.out.print(fib(i)+" ");
        }
        
    }
          public static int fib(int n){
            if(n==0) return 0;
             else if(n==1) return 1;
            else return fib(n-1)+fib(n-2);
        }
    
}
