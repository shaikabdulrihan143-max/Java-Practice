import java.util.*;

public class MaxMinInArrayList {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        System.out.println("Enter Number of elements in ArrayList:");
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
        System.out.println("Minimum:"+list.get(min));
    }
}
