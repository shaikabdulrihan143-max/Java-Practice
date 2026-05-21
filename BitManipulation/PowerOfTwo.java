import java.util.*;
public class Powerof2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //Write a program to find if a number is a power of 2 or not.
       System.out.println("Enter an number:");
       int n=in.nextInt();
       int temp=n;
       int b=0;
       String s="";
       if(n<=0){
        System.out.println(n+" is not a power of 2");
        return;
       }
        while(n>0){
            b=n%2;
            s=s+b;
            n=n/2;

        }
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1+=s.charAt(i);
        }
        System.out.println(s1);
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='1')
                count++;
        }
        if(count>1){
            System.out.println(temp+" is not a power of 2");
        }
        else{
            System.out.println(temp+" is a power of 2");
        }
    }
}
