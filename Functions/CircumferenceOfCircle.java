import java.util.*;

public class CircumferenceOfCircle {

    public static void circumferenceOfCircle(int r){
        double c=2*3.14*r;
        System.out.println(c);
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        int n1=in.nextInt();

        circumferenceOfCircle(n1);
    }
}
