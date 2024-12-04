
import java.util.*;


class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Enter Array Size : ");
         int size = sc.nextInt();
         System.out.print("Enter Array ELements : ");
         int[] arr = new int[size];
         for(int i = 0; i< size; i++){
             arr[i] = sc.nextInt();
         }
         int sum = 0;
         for(int i = 0; i<size; i++){
             sum = sum + arr[i];
         }
         System.out.println("Sum of array is : " + sum);
        
        
        
    }
}
