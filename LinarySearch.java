import java.util.*;
public class LinarySearch {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=in.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=in.nextInt();
        }
        System.out.println("Enter element to be searched");
        int key=in.nextInt();
        boolean exists=false;
        int temp=0;
        for(int i=0;i<size;i++){
            if(key==a[i]){
                exists=true;
                temp=i;
                break;
            }
            
        }
        if(exists){
            System.out.println("Element is found");
            System.out.println("Index: "+temp);
        }
        else{
            System.out.println("Element is not found");
        }
    }
}
