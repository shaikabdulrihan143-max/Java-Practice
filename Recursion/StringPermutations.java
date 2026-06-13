import java.util.*;

public class StringPermutations {

    public static void printPermutations(String s,String permutation){

        if(s.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);

            String newString=s.substring(0,i)+s.substring(i+1);

            printPermutations(newString,permutation+ch);
        }
    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.println("Enter a string");
        String s=in.next();

        printPermutations(s,"");
    }
}
