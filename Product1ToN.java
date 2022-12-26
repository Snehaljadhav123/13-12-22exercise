//product 1 to N 

//import java.util.*;
public class Product1ToN {
    public static void main(String[] args){
       int i;
       long product=1;
       // 1 to 11
        for(i=1;i<=11;i++){
            product=product*i;
        }
        System.out.println("product of 1 to 11 is : "+product);
       //1 to 12
        for(i=1;i<=12;i++){
            product=product*i;
        }
        System.out.println("product of 1 to 12 is : "+product);
        //1 to 13
        for(i=1;i<=12;i++){
            product=product*i;
        }
        System.out.println("product of 1 to 13 is : "+product);
        //1 to 14
        for(i=1;i<=14;i++){
            product=product*i;
        }
        System.out.println("product of 1 to 14 is : "+product);
        
        System.out.println("product of 1 to 13 is = 6227020800");
        System.out.println("size of int is : "+Integer.SIZE);
        System.out.println("size of long is : "+Long.SIZE);





        
    }
    
}
