import java.util.*;
public class BinarytoDecimal {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //METHOD-1
        /* String Binary="1010";
        int decimal=Integer.parseInt(Binary,2);
        System.out.println(decimal); */
        //METHOD-2;
        /* System.out.println("Enter a binary representatin of a number:");
        String Binary=in.nextLine();
        int decimal=0;
        int number=Integer.parseInt(Binary);
        int power=0;
        int d;
        while(number>0){
            d=number%10;
            decimal+=d*Math.pow(2,power++);
            number=number/10;
        }
        System.out.println(decimal); */
    }
}
