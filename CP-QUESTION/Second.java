import java.util.*;
// Q2. WAP which finds whether number is EVEN or ODD. 

public class Second{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  integer:");
        int a = sc.nextInt();
        if(a % 2 == 0) System.out.println(a + "is a even no.");
        else System.out.println(a + " is a odd no.");


        
    }
}