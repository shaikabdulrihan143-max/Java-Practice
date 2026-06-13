import java.util.*;
import java.util.Collections;

public class ArrayListOperations {
    public static void main(String[] args){

        ArrayList<Integer> list=new ArrayList<>();

        list.add(0);
        list.add(7);
        list.add(2);
        System.out.println(list);

        int ele=list.get(1);
        System.out.println(ele);

        list.add(1,9);
        System.out.println(list);

        list.set(0,6);
        System.out.println(list);

        int size=list.size();
        System.out.println(size);

        list.remove(list.size()-1);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
