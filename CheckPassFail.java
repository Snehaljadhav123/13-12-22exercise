import java.util.Scanner;


public class CheckPassFail {
    public static void main(String[] args){
        int marks;
        Scanner m=new Scanner(System.in);
        System.out.println("enter your marks : ");
        marks=m.nextInt();
        if(marks>=50)
        System.out.println( "PASS ");
        else
        System.out.println(" Fail ");
        m.close();
    }
}
