import java.util.*;

public class TilePlacement {

    public static int placeTiles(int n,int m){

        if(n==m)
            return 2;

        if(n<m)
            return 1;

        int v=placeTiles(n-m,m);
        int h=placeTiles(n-1,m);

        return v+h;
    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.println("Enter number of rows");
        int n=in.nextInt();

        System.out.println("Enter number of columns");
        int m=in.nextInt();

        System.out.println(placeTiles(n,m));
    }
}
