import java.util.*;

public class GreatestOfTwoNumbers {

    public static int greatest(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int n1=in.nextInt();
        int n2=in.nextInt();

        System.out.println(greatest(n1,n2));
    }
}
