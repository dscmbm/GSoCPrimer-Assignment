import java.util.*;
// WAP which reverse a string S.
public class Ningth {
    public static void swap(char c[] , int i , int j){
        char temp =c[i];
        c[i] = c[j];
        c[j] =temp;

    }
    public static void main(String[] args) {
        System.out.println("enter a string : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        int n = c.length;
        // Reverse the array
        for (int i=0, j=n-1; i<j; i++, j--) {
            // Swap elements at i and j
            swap(c , i , j);
        }
    // / Print the reversed string
        System.out.print("\nReversed string is:");
        System.out.println(c);


    }

        
}
