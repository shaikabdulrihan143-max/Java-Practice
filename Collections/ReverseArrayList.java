import java.util.*;

public class ReverseArrayList {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

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
