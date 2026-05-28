import java.util.*;
public class QuickSort {
    /* public static void sort(int a[],int si,int ei){//pivot as first element
        if(si>=ei){
            return;
        }
        int pivot=si;
        int left=si+1;
        int right=ei;
        while(left<=right){
            if(a[left]>a[pivot] && a[right]<a[pivot]){
                int temp=0;
                temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
            if(left<=ei && a[left]<a[pivot]){
                left++;
            }
            if( right>=si && a[right]>a[pivot]){
                right--;
            }
        }
        int temp=a[pivot];
        a[pivot]=a[right];
        a[right]=temp;
        pivot=right;
        sort(a,si,pivot-1);
        sort(a,pivot+1,ei);
    } */
    public static void sort(int a[],int si, int ei){
        if(si>=ei){
            return;
        }
        int pivot=ei;
        int left=si;
        int right=ei-1;
        while(left<=right){
            if(a[left]>a[pivot] && a[right]<a[pivot]){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
            if(left<=ei && a[left]<a[pivot]){
                left++;
            }
            if( right>=si && a[right]>a[pivot]){
                right--;
            }
        }
        int temp=a[pivot];
        a[pivot]=a[left];
        a[left]=temp;
        pivot=left;
        sort(a,si,pivot-1);
        sort(a,pivot+1,ei);
    }
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=in.nextInt();
        }
        sort(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }
}
