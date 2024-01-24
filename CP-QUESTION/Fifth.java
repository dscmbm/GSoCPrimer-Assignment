// WAP which finds maximum number in an array. 
import java.util.*;
public class Fifth {
    public static void main(String[] args) {
        int n, max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter elements of the array:");
        for (int i=0; i<n; i++)  arr[i] = sc.nextInt();


        max = arr[0];  

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        } 

        System.out.println("max of an array is : " + max);
        

        
    }
    
}
