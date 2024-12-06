import java.util.*;


class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 1;
        
        // int max1 = Math.max(a,b); //max1 = 10
        // int max2 = Math.max(b,c); //max2 = 10;
        // int maxres = Math.max(max1, max2); //10
        
        // int min1 = Math.min(a,b); //min1 = 5
        // int min2 = Math.min(b,c); //min2 = 1;
        // int minres = Math.min(min1, min2); //1
        
        int max = Math.max(Math.max(a,b), Math.max(b,c)); //max = 10
        int min = Math.min(Math.min(a,b), Math.min(b,c));
        
        System.out.print((a+b+c)-(max + min));
    }
}
