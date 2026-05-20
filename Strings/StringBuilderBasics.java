import java.util.*;
public class StringBuilderBasics {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        /* StringBuilder sb=new StringBuilder("Hello");
        System.out.println(sb); */
        //Accesing
        // System.out.println(sb.charAt(2));
        //set char at index
       /*  sb.setCharAt(0,'C');
        System.out.println(sb); */
        //Insertion
        /* sb.insert(0,'a');
        System.out.println(sb); */
        //Deletion
        /* sb.delete(0,2);
        System.out.println(sb); */
        //Appending
        /* sb.append(" Abdul");
        System.out.println(sb); */
        //Reversing a string
        /* String s="";
        for(int i=sb.length()-1;i>=0;i--){
            s=s+sb.charAt(i);
        }
        System.out.println(s); */
        /* Input a string from the user. Create a new string called ‘result’ 
        in which you will replace the letter ‘e’ in the original string with letter ‘i’. */
        /* System.out.println("Enter a string");
        StringBuilder sb=new StringBuilder(in.nextLine());
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='e')
                sb.setCharAt(i,'i');
        }
        System.out.println(sb); */
        /* Input an email from the user. You have to create a username from the email 
        by deleting the part that comes after ‘@’. Display that username to the user. */
        /* System.out.println("Enter an email:");
        StringBuilder email=new StringBuilder(in.next());
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@')
                email.delete(i,email.length());
        }
        System.out.println(email); */

    }
}
