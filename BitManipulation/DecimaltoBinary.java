import java.util.*;
public class DecimaltoBinary {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter an number:");
        int n=in.nextInt();
        int temp=n;
        String s="";
        int b;
        while(n>0){
            b=n%2;
            s+=b;
            n=n/2;
        }
        String Binary="";
        for(int i=s.length()-1;i>=0;i--){
            Binary+=s.charAt(i);
        }
        System.out.println("BInary Representation of "+ temp+" is:"+Binary);

    }
}
