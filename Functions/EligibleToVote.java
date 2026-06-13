import java.util.*;

public class EligibleToVote {

    public static void eligibleToVote(int age){
        if(age>=18)
            System.out.println("Eligible to vote");
        else
            System.out.println("Not Eligible to vote");
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int n1=in.nextInt();

        eligibleToVote(n1);
    }
}
