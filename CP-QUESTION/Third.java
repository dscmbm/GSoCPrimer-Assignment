import java.util.*;
// . WAP which find factorial of a number N.


public class Third {
    public static long factorialCalculation(long n){
        if(n == 0 || n == 1) return 1;
        return n * factorialCalculation(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        long n = sc.nextInt();
        
        long result = factorialCalculation(n) ;
        System.out.println("factorial of " + n + " is " + result);
       
        
    }
    
}
