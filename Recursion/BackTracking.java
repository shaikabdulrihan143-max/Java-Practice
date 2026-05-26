import java.util.*;
public class BackTracking {
    public static void printArrangements(String s,String arrangement){
        if(s.length()==0){
            System.out.println(arrangement);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String n=s.substring(0,i)+s.substring(i+1);
            printArrangements(n, arrangement+ch);
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        printArrangements("ABCD", "");
    }
}
