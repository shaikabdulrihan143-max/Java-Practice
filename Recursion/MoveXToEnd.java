import java.util.Scanner;

public class MoveXToEnd {

    public static String n1="";
    public static String n2="";

    public static String move(char ch,int idx,String s){

        if(idx==s.length())
            return n1+n2;

        if(s.charAt(idx)==ch){
            n2=n2+s.charAt(idx);
        }
        else{
            n1=n1+s.charAt(idx);
        }

        return move(ch,idx+1,s);
    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.println("Enter a string");
        String s=in.next();

        System.out.println(move('x',0,s));
    }
}
