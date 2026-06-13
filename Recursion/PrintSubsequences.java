import java.util.Scanner;

public class PrintSubsequences {

    public static void subSequence(String s,int idx,String newString){

        if(idx==s.length()){
            System.out.println(newString);
            return;
        }

        char ch=s.charAt(idx);

        subSequence(s,idx+1,newString+ch);
        subSequence(s,idx+1,newString);
    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.println("Enter a string:");
        String s=in.next();

        subSequence(s,0,"");
    }
}
