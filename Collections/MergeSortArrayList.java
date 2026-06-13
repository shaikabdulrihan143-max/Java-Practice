import java.util.*;

public class MergeSortArrayList {

    public static void merge(ArrayList<Integer> list,int si,int mid,int ei){

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
    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        System.out.println("Enter Number of elements in ArrayList:");
        int n=in.nextInt();

        for(int i=0;i<n;i++){
            int ele=in.nextInt();
            list.add(ele);
        }

        divide(list,0,list.size()-1);

        System.out.println(list);
    }
}
