import java.util.*;

public class SearchInArrayList {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();

        System.out.println("Enter Number of elements in ArrayList:");
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
        }
    }
}
