import java.util.*;

public class PowerOfNumber {

    public static void power(int x,int n){
        System.out.println(Math.pow(x,n));
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int n1=in.nextInt();
        int n2=in.nextInt();

        power(n1,n2);
    }
}
