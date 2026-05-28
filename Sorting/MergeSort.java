import java.util.*;
public class MergeSort {
    //Time Complexity:o(nlogn)
    public static void conquer(int a[],int i,int mid,int j){
        int newArray[]=new int[j+1-i];
        int idx=0;
        int idx1=i;//one part of array starting idx
        int idx2=mid+1;//another part of array starting idx
        while(idx1<=mid && idx2<=j){
            if(a[idx1]<=a[idx2]){
                newArray[idx++]=a[idx1++];
            }
            else{
                newArray[idx++]=a[idx2++];
            }
        }
        while(idx1<=mid){
            newArray[idx++]=a[idx1++];
        }
        while(idx2<=j){
            newArray[idx++]=a[idx2++];
        }
        for(int h=0,k=i;h<newArray.length;h++,k++){
            a[k]=newArray[h];
        }
    }
    public static void divide(int a[],int i,int j){
        if(i>=j){
            return;
        }
        int mid=i+(j-i)/2;//or mid=i+(j-i)/2
        divide(a,i,mid);
        divide(a,mid+1,j);
        conquer(a,i,mid,j);

    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("ENter the size of array");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        divide(a,0,n-1);
        System.out.println(Arrays.toString(a));

    }
}
