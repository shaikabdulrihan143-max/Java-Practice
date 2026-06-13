import java.util.Scanner;

public class PowerNaive {

    public static int powerNaive(int x,int n){

        if(n == 0)
            return 1;

        if(x == 0)
            return 0;

        return x * powerNaive(x,n - 1);
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter x value:");
        int x = in.nextInt();

        System.out.println("Enter n value:");
        int n = in.nextInt();

        System.out.println(powerNaive(x,n));
    }
}
