import java.util.Scanner;

public class PhoneKeypadCombinations {

    public static String[] keypad={
        ".",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tu",
        "vwz",
        "yz"
    };

    public static void printComb(String s,int idx,String combination){

        if(idx==s.length()){
            System.out.println(combination);
            return;
        }

        char currChar=s.charAt(idx);

        String mapping=keypad[currChar-'0'];

        for(int i=0;i<mapping.length();i++){
            printComb(s,idx+1,combination+mapping.charAt(i));
        }
    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.println("Enter a string:");
        String s=in.next();

        printComb(s,0,"");
    }
}
