import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    /* public static void merge(ArrayList<Integer> list,int si,int mid,int ei){
        ArrayList<Integer> newList=new ArrayList<>();
        int idx1=si;
        int idx2=mid+1;
        while(idx1<=mid && idx2<=ei){
            if(list.get(idx1)<list.get(idx2)){
                newList.add(list.get(idx1++));
            }
            else{
                newList.add(list.get(idx2++));
            }
        }
        while(idx1<=mid){
            newList.add(list.get(idx1++));
        }
        while(idx2<=ei){
            newList.add(list.get(idx2++));
        }
        for(int i=si,j=0;i<=ei;i++,j++){
            list.set(i,newList.get(j));
        }
    }
    public static void divide(ArrayList<Integer> list,int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        divide(list,si,mid);
        divide(list,mid+1,ei);
        merge(list,si,mid,ei);
    } */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        //OPERATION IN ARRAYLIST
        /* //add operation
        list.add(0);
        list.add(7);
        list.add(2);
        System.out.println(list);
        //get element
        int ele=list.get(1);
        System.out.println(ele);
        //add element in between
        list.add(1,9);
        System.out.println(list);
        //set element
        list.set(0,6);
        System.out.println(list);
        //size of arraylist
        int size=list.size();
        System.out.println(size);
        //remove element
        list.remove(list.size()-1);
        System.out.println(list);
        //sort
        Collections.sort(list);
        System.out.println(list); */
        // searching and printing the index of that key in ArrayList
        /* System.out.println("Enter Number of elements in ArrayList:");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int ele=in.nextInt();
            list.add(ele);
        }
        System.out.println("Enter key to be searched");
        int key=in.nextInt();
        for(int i=0;i<n;i++){
            if(list.get(i)==key){
                System.out.println("Element is found at "+ i);
                break;
            }
        } */
        //finding maximum and minimum integer in an array
        /* System.out.println("Enter Number of elements in ArrayList:");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int ele=in.nextInt();
            list.add(ele);
        }
        int max=0;
        int min=0;
        for(int i=1;i<list.size();i++){
            if(list.get(i)>list.get(max)){
                max=i;
            }
            if(list.get(i)<list.get(min)){
                min=i;
            }
        }
        System.out.println("Maximum:"+list.get(max));
        System.out.println("Minimum:"+list.get(min));*/
        // cheking arraylist is sorted or not
        /* System.out.println("Enter Number of elements in ArrayList:");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int ele=in.nextInt();
            list.add(ele);
        }
        divide(list,0,list.size()-1);
        System.out.println(list); */
        // reverse an arrayList
        System.out.println("Enter Number of elements in ArrayList:");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int ele=in.nextInt();
            list.add(ele);
        }
        for(int i1=0,i2=list.size()-1;i1<list.size()/2;i1++,i2--){
            int temp=list.get(i1);
            list.set(i1,list.get(i2));
            list.set(i2,temp);
        }
        System.out.println(list);
    }
}
