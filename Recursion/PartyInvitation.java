import java.util.*;

public class PartyInvitation {

    public static int callGuest(int n){

        if(n<=1)
            return 1;

        int sWays=callGuest(n-1);

        int pWays=(n-1)*callGuest(n-2);

        return sWays+pWays;
    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.println("Enter number of peoples to invite");
        int n=in.nextInt();

        System.out.println(callGuest(n));
    }
}
