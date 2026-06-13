import java.util.Scanner;

public class FirstAndLastOccurrence {

    public static void findFandLastOccurance(String s,char ch,int first,int last,int idx){

        if(idx==s.length()){
            if(last==-1){
                last=first;
            }
            System.out.print(last);
            return;
        }

        if(s.charAt(idx)==ch){

            if(first==-1){
                first=idx;
                System.out.print(first+",");
            }
            else{
                last=idx;
            }
        }

        findFandLastOccurance(s,ch,first,last,idx+1);
    }

    public static void main(String[] args){

        Scanner in=new Scanner(System.in);

        System.out.println("Enter a string");
        String s=in.nextLine();

        System.out.println("Enter an element");
        char ch=in.next().charAt(0);

        findFandLastOccurance(s,ch,-1,-1,0);
    }
}
