import java.util.Scanner;

public class PowerOptimized {

    public static int powerOptimized(int x,int n){

        if(n == 0)
            return 1;

        if(x == 0)
            return 0;

        if(n % 2 == 0){
            return powerOptimized(x,n/2) * powerOptimized(x,n/2);
        }
        else{
            return powerOptimized(x,n/2) * powerOptimized(x,n/2) * x;
        }
    }

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter x value:");
        int x = in.nextInt();

        System.out.println("Enter n value:");
        int n = in.nextInt();

        System.out.println(powerOptimized(x,n));
    }
}
