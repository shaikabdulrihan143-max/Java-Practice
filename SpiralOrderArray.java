import java.util.*;
public class SpiralOrderArray {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int n=in.nextInt();
        System.out.println("Enter number of columns");
        int m=in.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=in.nextInt();
            }
        }
        int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=m-1;
        while(rowStart<=rowEnd && colStart<=colEnd){
            //top row
            for(int col=colStart;col<=colEnd;col++){
                System.out.print(a[rowStart][col]+" ");
            }
            rowStart++;
            //right column
            for(int row=rowStart;row<=rowEnd;row++){
                System.out.print(a[row][colEnd]+" ");
            }
            colEnd--;
            //bottom row
            for(int col=colEnd;col>=colStart;col--){
                System.out.print(a[rowEnd][col]+" ");
            }
            rowEnd--;
            //left column
            for(int row=rowEnd;row>=rowStart;row--){
                System.out.print(a[row][colStart]+" ");
            }
            colStart++;
            System.out.println();
        }
    }
}
