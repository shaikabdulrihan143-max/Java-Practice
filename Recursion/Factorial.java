import java.util.Scanner;

public class Factorial {

    public static int factorial(int n){
        if(n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = in.nextInt();

        if(n < 0)
            System.out.println("Not Exists");
        else
            System.out.println(factorial(n));
    }
}
