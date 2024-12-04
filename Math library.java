
import java.util.*;


class Main {
    public static void main(String[] args) {
        int x = 5; 
        int y = 10;
        
        //It will work for float and double as well
        
        // float x = 2.5f;
        // float y = 3.5f;
        double a = 65;
        
        // System.out.println(Math.max(x,y));
        // System.out.println(Math.min(x,y));
        // System.out.print(Math.sqrt(a)); //stores values in double
        
        //for typecasting double to int
        
        double res = Math.sqrt(a);
        System.out.print((int)res); //typecasting to integer
        
        
    }
}
