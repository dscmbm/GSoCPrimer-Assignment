import java.util.*;
// WAP to find maximum Number among three integers ( A,B and C) 
public class Tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number :");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();
        if(a > b){
            if(a > c) System.out.println("The largest number is " + a);
            
            else System.out.println("The largest number is " + c);
            
        }else{
            if(b > c) System.out.println("The largest number is " + b);    
            else System.out.println("The largest number is " + c);
        }
            
        

        
    }
}
