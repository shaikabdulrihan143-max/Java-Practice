import java.util.*;
public class ReverseString {
    public static void reverse(String s,int length){
        if(length<0)
            return;
        System.out.print(s.charAt(length));
        reverse(s, length-1);
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=in.nextLine();
        int length=s.length()-1;
        reverse(s, length);
    }
}
