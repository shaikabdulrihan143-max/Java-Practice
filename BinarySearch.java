import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=in.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();
        }
        int low=0,high=size-1,temp;
        //sorting
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        //sorted array
        System.out.println(Arrays.toString(a));
        System.out.println("Enter element to be searched");
        int key=in.nextInt();
        int mid;
        //Binary Search
        mid=(low+high)/2;
        while(low<=high){
            if(key==a[mid]){
                System.out.println("Element is found");
                System.out.println("Index: "+mid);
                break;
            }
            else if(key<a[mid])
                high=mid-1;
            else
                low=mid+1;
            mid=(low+high)/2;
        }
    }
}
