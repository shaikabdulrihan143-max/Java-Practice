import java.util.*;
public class Recursion2 {
    /* public static int stepsForTransfering(int n){
        if(n==0)
            return 0;
        return stepsForTransfering(n-1)+1+stepsForTransfering(n-1);
    } */
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //Tower of hanoi for calculating number of steps(min) for transfering
        /* System.out.println("Enter number of disks");
        int n=in.nextInt();
        System.out.println(stepsForTransfering(n)); */
        //Tower of Hanoi transferring process
        System.out.println("Enter number of disks");
        int n=in.nextInt();
        towerOfHanoi(n, "S", "H", "D");

        
    }
}
