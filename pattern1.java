// Pattern 1 :
// Enter N : 5
// *****
// *****
// *****
// *****
// *****

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){ //this is for rows
            for(int j = 1; j<=n; j++){ //this is for col
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
