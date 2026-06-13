import java.util.*;

public class PrintUniqueSubsequences {

    public static void subSequence(String s,int idx,String newString,HashSet<String> set){

        if(idx==s.length()){

            if(set.contains(newString))
                return;

            System.out.println(newString);
            set.add(newString);
            return;
        }

        char ch=s.charAt(idx);

        subSequence(s,idx+1,newString+ch,set);
        subSequence(s,idx+1,newString,set);
    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.println("Enter a string:");
        String s=in.next();

        HashSet<String> set=new HashSet<>();

        subSequence(s,0,"",set);
    }
}
