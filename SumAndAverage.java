//finding sum and average of 1 t0 100 numbers


public class SumAndAverage {
    public static void main(String[] agrs){
        int sum=0;
        double average;
        for(int i=0;i<=100;i++){
            sum=sum+i;
        }
        average=sum/100;
        System.out.println("sum is : "+sum);
        System.out.println("average is : "+average);
    }
}
