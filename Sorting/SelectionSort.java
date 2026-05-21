import java.util.*;
public class SelectionSort {
    public static void main(String [] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        int min,temp;
        for(int i=0;i<a.length;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=a[j];
                }
            }
            temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
