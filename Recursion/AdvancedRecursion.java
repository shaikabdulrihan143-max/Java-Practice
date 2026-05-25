import java.util.*;
public class AdvancedRecursion {
    /* public static void printPermutations(String s,String permutation){
        if(s.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String newString=s.substring(0,i)+s.substring(i+1);
            printPermutations(newString, permutation+ch);
        }
    } */
   /*  public static int countPaths(int i,int j,int n,int m){
        if(i==n || j==m)
            return 0;
        if(i==n-1 && j==m-1)
            return 1;
        //downwards
        int downPath=countPaths(i+1, j, n, m);
        //towards right
        int rightPath=countPaths(i, j+1, n, m);
        return downPath+rightPath;
    } */
   /*  public static int placeTiles(int n,int m){
        if(n==m)
            return 2;
        if(n<m)
            return 1;


        //verticalplacement
        int v=placeTiles(n-m, m);
        //horizontalplacement
        int h=placeTiles(n-1, m);
        return v+h;
    } */
    /* public static int callGuest(int n){
        if(n<=1)
            return 1;
        //singles
        int sWays=callGuest(n-1);
        //pairs
        int pWays=(n-1)*callGuest(n-2);
        return sWays+pWays;
    } */
    /* public static void printSubsets(int n,int a[],int idx,ArrayList<Integer> subset){
        if(idx==a.length){
            System.out.println(subset);
            return;
        }
        int digit=a[idx];
        //include
        subset.add(digit);
        printSubsets(n, a, idx+1,subset);
        //exclude
        subset.remove(subset.size()-1);
        printSubsets(n, a, idx+1, subset);

    } */
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        //print all permutation of a string
        /* System.out.println("Enter a string");
        String s=in.next();
        printPermutations(s, "");*/
        //count total paths in a maze to move from (0,0) to (n,m)
        /* System.out.println("Enter nuber of rows");
        int n=in.nextInt();
        System.out.println("Enter number of columns");
        int m=in.nextInt();
        System.out.println(countPaths(0, 0, n, m)); */
        //total ways to place tiles of size 1*m in a floor of size n*m
        /* System.out.println("Enter nuber of rows");
        int n=in.nextInt();
        System.out.println("Enter number of columns");
        int m=in.nextInt();
        System.out.println(placeTiles(n, m)); */
        //number of ways to invite a people in party(single,pairs)
        /* System.out.println("Enter number of peoples to invite");
        int n=in.nextInt();
        System.out.println(callGuest(n));*/
        //print all subsets of a set of first n natural numbers
        /* ArrayList<Integer> subset=new ArrayList<>();
        System.out.println("Enter n value");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=i+1;
        }
        printSubsets(n, a, 0, subset); */
    }
}
