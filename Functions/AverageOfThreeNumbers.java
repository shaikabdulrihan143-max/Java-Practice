import java.util.*;

public class AverageOfThreeNumbers {

    public static void printAverage(int a,int b,int c){
        System.out.println((a+b+c)/3);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();

        printAverage(n1,n2,n3);
    }
}
