import java.util.Scanner;

public class RemoveDuplicatesString {

    public static void reverse(String s,String newString,int idx,boolean map[]){

        if(idx==s.length()){
            System.out.println(newString);
            return;
        }

        int i=s.charAt(idx)-'a';

        if(map[i]==false){

            newString+=s.charAt(idx);
            map[i]=true;

            reverse(s,newString,idx+1,map);
        }
        else{
            reverse(s,newString,idx+1,map);
        }
    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        boolean map[]=new boolean[26];

        System.out.println("Enter a string");
        String s=in.next();

        reverse(s.toLowerCase(),"",0,map);
    }
}
