import java.util.*;
public class QuickSort {
    /* Time complexity 
    Average: O(nlogn)
    Worst:O(n^2) */
    // Quick Sort using first element as pivot
    /* public static void sort(int a[],int si,int ei){//pivot as first element
        if(si>=ei){
            return;
        }
        int pivot=a[si];
        int left=si;
        int right=ei;
        while(left<=right){
            while(left<=ei && a[left]<pivot){
                left++;
            }
            while(right>=si && a[right]>pivot){
                right--;
            }
            if(left<=right){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }
        sort(a,si,right);
        sort(a,left,ei);
    } */
   // Quick Sort using last element as pivot
    /* public static void sort(int a[],int si, int ei){//pivot as end element
        if(si>=ei){
            return;
        }
        int pivot=a[ei];
        int left=si;
        int right=ei;
        while(left<=right){
            while(a[left]<pivot){
                left++;
            }
            while(a[right]>pivot){
                right--;
            }
            if(left<=right){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }
        sort(a,si,right);
        sort(a,left,ei);
    } */
   // Quick Sort using middle element as pivot
   public static void sort(int a[],int si,int ei){//pivot as mid element
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        int pivot=a[mid];
        int left=si;
        int right=ei;
        while(left<=right){
            while(a[left]<pivot){
                left++;
            }
            while(a[right]>pivot){
                right--;
            }
            if(left<=right){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
        }
        sort(a,si,right);
        sort(a,left,ei);
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
