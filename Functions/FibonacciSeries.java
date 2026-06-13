import java.util.*;

public class FibonacciSeries {

    public static void fibonacciSeries(int n){

        int a=0,b=1,k;

        System.out.print(a+" "+b+" ");

        int count=2;

        while(count<n){

            k=a+b;

            System.out.print(k+" ");

            a=b;
            b=k;

            count+=1;
        }
    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int n1=in.nextInt();

        fibonacciSeries(n1);
    }
}
