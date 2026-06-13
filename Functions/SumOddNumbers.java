import java.util.*;

public class SumOddNumbers {

    public static void sumOddNumbers(int n){
        int sum=0;

        for(int i=1;i<=n;i++){
            if(i%2==1)
                sum+=i;
        }

        System.out.println(sum);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int n1=in.nextInt();

        sumOddNumbers(n1);
    }
}
