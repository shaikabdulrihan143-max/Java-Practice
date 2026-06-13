import java.util.Scanner;

public class FibonacciSeries {

    public static void fibonacciSeries(int a,int b,int n,int count){

        if(count == (n - 2))
            return;

        int c = a + b;

        System.out.print(" " + c);

        count++;

        fibonacciSeries(b,c,n,count);
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int n = in.nextInt();

        int a = 0;
        int b = 1;

        if(n == 1){
            System.out.println(a);
        }
        else{
            System.out.print(a + " " + b);
            fibonacciSeries(a,b,n,0);
        }
    }
}
