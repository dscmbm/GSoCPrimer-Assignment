import java.util.*;
// WAP which checks that a given year is leap year or not (hint: After Every four year)

public class Eight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any year : ");
        
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " is a Leap Year");
        }else {
            System.out.println(year + " is Not a Leap Year");
        }
        

    
    }
    
}
