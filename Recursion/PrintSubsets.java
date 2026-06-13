import java.util.*;

public class PrintSubsets {

    public static void printSubsets(int n,int a[],int idx,
                                    ArrayList<Integer> subset){

        if(idx==a.length){
            System.out.println(subset);
            return;
        }

        int digit=a[idx];

        subset.add(digit);
        printSubsets(n,a,idx+1,subset);

        subset.remove(subset.size()-1);
        printSubsets(n,a,idx+1,subset);
    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        ArrayList<Integer> subset=new ArrayList<>();

        System.out.println("Enter n value");
        int n=in.nextInt();

        int a[]=new int[n];

        for(int i=0;i<n;i++){
            a[i]=i+1;
        }

        printSubsets(n,a,0,subset);
    }
}
