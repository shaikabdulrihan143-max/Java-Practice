import java.util.*;

public class CumulativeStringLength {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.println("Enter the size of the Array:");

        int n=in.nextInt();

        String str[]=new String[n];

        for(int i=0;i<n;i++)
            str[i]=in.next();

        int cummulativeLength=0;

        System.out.println(Arrays.toString(str));

        for(int i=0;i<n;i++){
            cummulativeLength+=str[i].length();
        }

        System.out.println(cummulativeLength);
    }
}
