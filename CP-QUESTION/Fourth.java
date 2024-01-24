import java.util.*;

// WAP which counts the number of vowels in a string.

public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        int count = 0; // variable to store the count of vowels
        for (int i=0; i<str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i)); // converting each
            // character to lowercase
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++; // incrementing the count whenever a vowel is found
            }
            

        }

        System.out.println("no of vowel in " + str + " is " + count);
    }
    
}
