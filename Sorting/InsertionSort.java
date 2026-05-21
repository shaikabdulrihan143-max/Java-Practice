import java.util.*;
public class InsertionSort {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        for(int i=1;i<a.length;i++){
            int current=a[i];
            int j=i-1;
            while(j>=0 && current<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }
        System.out.println(Arrays.toString(a));
    }
}
