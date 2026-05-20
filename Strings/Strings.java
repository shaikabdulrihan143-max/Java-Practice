import java.util.*;
public class Strings {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //Strings are immutable
        // String name="Abdul";
        // System.out.println(name);
        // String str=in.nextLine();
        // System.out.println(str);
        //concatenation
        /* String s1,s2;
        s1="Hello";
        s2="Viewers";
        String s3=s1+s2;
        System.out.println(s3); */
        //Length
        /* String str="Abdul Rihan";
        int len=str.length();
        System.out.println(len); */
        //Accessing
        /* String str="Hello Viewers";
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+",");
        } */
       //comparision
        //    String s1="hii";
        //    String s2="hiiiiiiii";
        //    System.out.println(s1.equals(s2));
        //    System.out.println(s1==s2);
        /*
        1.s1<s2:->-ve value
        2.s1==s2:->0
        3.s1>s2:->+ve value
        */
        //System.out.println(s1.compareTo(s2)); 
        //hello<wello:h<w(ASCII VALUE)
        //hello>cello:h>c(ASCII VALUE)
        //SUBSTRING
        // String str="Hello Viewers My name is Abdul Rihan";
        // System.out.println(str.substring(6,str.length()));
        //String -> Integer
        /* String str="1234";
        int  number=Integer.parseInt(str);
        System.out.println(number); */
        //Integer-> String
        /* int number=123;
        String str=Integer.toString(number);
        System.out.println(str.length()); */
        //Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        /* System.out.println("Enter the size of the Array:");
        int n=in.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++)
            str[i]=in.next();
        int cummulativeLength=0;
        System.out.println(Arrays.toString(str));
        for(int i=0;i<n;i++){
            cummulativeLength+=str[i].length();
        }
        System.out.println(cummulativeLength); */
        /* Input a string from the user. Create a new string called ‘result’ 
        in which you will replace the letter ‘e’ in the original string with letter ‘i’.  */
        /* System.out.println("Enter a string before change");
        String s1="eabcdef";
        String s="e";
        String result="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)=='e')
                result+="i";
            else{
                result+=s1.charAt(i);
            }
        }
        System.out.println(result); */
        /* Input an email from the user. You have to create a username from the email 
        by deleting the part that comes after ‘@’. Display that username to the user. */
        /* System.out.println("Enter an email");
        String email=in.nextLine();
        int temp=0;
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@')
                temp=i;
        }
        System.out.println(email.substring(0,temp));
        */
    }
}
