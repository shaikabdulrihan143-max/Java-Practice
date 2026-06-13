import java.util.Scanner;

public class ExtractUsernameFromEmail {
    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.println("Enter an email");

        String email=in.nextLine();

        int temp=0;

        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@')
                temp=i;
        }

        System.out.println(email.substring(0,temp));
    }
}
