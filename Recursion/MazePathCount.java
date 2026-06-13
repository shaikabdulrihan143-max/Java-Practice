import java.util.*;

public class MazePathCount {

    public static int countPaths(int i,int j,int n,int m){

        if(i==n || j==m)
            return 0;

        if(i==n-1 && j==m-1)
            return 1;

        int downPath=countPaths(i+1,j,n,m);
        int rightPath=countPaths(i,j+1,n,m);

        return downPath+rightPath;
    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.println("Enter number of rows");
        int n=in.nextInt();

        System.out.println("Enter number of columns");
        int m=in.nextInt();

        System.out.println(countPaths(0,0,n,m));
    }
}
