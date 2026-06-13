import java.util.*;

public class Factorial {

    public static void Factorial(int n){
        if(n<0){
            System.out.println("Invalid Choice");
            return;
        }

        int result=1;

        for(int i=n;i>0;i--)
            result*=i;

        System.out.println("Factorial of "+n+" is "+result);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int n1=in.nextInt();

        Factorial(n1);
    }
}
