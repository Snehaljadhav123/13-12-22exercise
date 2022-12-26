// calulating fibonacci series and average..

//[1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765]

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
          int term,a=0,b=1,c;
          float average;
          int sum=0;
          System.out.println("enter range of series : ");
          //entering the range 21 
          Scanner sc=new Scanner(System.in);
          term=sc.nextInt();
         for(int i=1;i<=term;i++){
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
            sum=sum+a;     
        }
        average=(float)sum/20;
        
        System.out.println("\n average is : "+average);
        sc.close();

    }
    
}
