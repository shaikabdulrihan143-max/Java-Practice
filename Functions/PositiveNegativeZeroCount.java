import java.util.*;

public class PositiveNegativeZeroCount {

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        int p=0,n=0,z=0;
        int n1,n2;

        System.out.println("Enter 0 to exit & 1 to start");

        n1=in.nextInt();

        System.out.println("Enter inputs");

        while(n1==1){

            n2=in.nextInt();

            if(n2>0)
                p+=1;
            else if(n2<0)
                n+=1;
            else
                z+=1;

            System.out.println("Enter 0 to exit & 1 to start");

            n1=in.nextInt();
        }

        System.out.println("Positive:"+p+" Negatives:"+n+" Zeroes:"+z);
    }
}
