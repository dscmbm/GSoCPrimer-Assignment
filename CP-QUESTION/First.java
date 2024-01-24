import java.util.*;
// Q1. WAP  which multiplies two integers  A and B . 

public class First{
    public static int multiply(int a , int b){
        return (a * b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int a = sc.nextInt();
        System.out.println("Enter the second integer:");
        int b = sc.nextInt();
        // calling method multiply() to get product of A & B
        System.out.println("The product is : " + multiply(a,b));
        
    }
}