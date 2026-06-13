import java.util.*;

public class GCDOfTwoNumbers {

    public static void GCD(int a,int b){

        while(a!=b){

            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }

        System.out.println("GCD OF TWO NUMBERS:"+b);
    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int n1=in.nextInt();
        int n2=in.nextInt();

        GCD(n1,n2);
    }
}
