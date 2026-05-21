import java.util.*;
public class BubbleSort {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=in.nextInt();
        }
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){//for Descending order change > to <
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
