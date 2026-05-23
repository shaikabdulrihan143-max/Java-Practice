import java.util.*;
public class Recursion2 {
    /* public static String n1="";
    public static String n2=""; */
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwz","yz"};
    /* public static void findFandLastOccurance(String s,char ch,int first,int last,int idx){
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
        findFandLastOccurance(s, ch, first, last,idx+1);
    } */
    /* public static boolean checkIfSorted(int a[],int idx){
        if(idx==a.length-1){
            return true;
        }

        if(a[idx]>=a[idx+1])
            return false;
        else
            return checkIfSorted(a,idx+1);
    } */
    /* public static String move(char ch,int idx,String s){
        if(idx==s.length())
            return n1+n2;
        if(s.charAt(idx)==ch){
            n2=n2+s.charAt(idx);
        }
        else{
            n1=n1+s.charAt(idx);
        }
        return move(ch, idx+1, s);
    }*/    
    /* public static void reverse(String s,String newString,int idx,boolean map[]){
        if(idx==s.length()){
            System.out.println(newString);
            return;
        }
        int i=s.charAt(idx)-'a';
        if(map[i]==false){
            newString+=s.charAt(idx);
            map[i]=true;
           reverse(s, newString, idx+1, map);
        }
        else{
            reverse(s, newString, idx+1, map);
        }
    } */
    /* public static void subSequence(String s,int idx,String newString){
        if(idx==s.length()){
            System.out.println(newString);
            return;
        }
        char ch=s.charAt(idx);
        subSequence(s, idx+1, newString+ch);//include
        subSequence(s, idx+1, newString);//exclude
    }*/  
    /*  public static void subSequence(String s,int idx,String newString,HashSet<String> set){
        if(idx==s.length()){
            if(set.contains(newString))
                return;
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char ch=s.charAt(idx);
        subSequence(s, idx+1, newString+ch,set);//include
        subSequence(s, idx+1, newString,set);//exclude
    } */
    public static void printComb(String s,int idx,String combination){
        if(idx==s.length()){
            System.out.println(combination);
            return;
        }
        char currChar=s.charAt(idx);
        String mapping=keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            printComb(s, idx+1, combination+mapping.charAt(i));
        }

    }
   public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        //Find 1st and last occurance of an element in string
        /* System.out.println("Enter a string");
        String s=in.nextLine();
        System.out.println("Enter an element");
        char ch=in.next().charAt(0);
        int first=-1;
        int last=-1;
        int idx=0; */
        //with recursion
        /* findFandLastOccurance(s, ch, first, last,idx); */
        //without recursion
        /* for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==ch){
                first=i;
                break;
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==ch){
                last=i;
                break;
            }
        }
        System.out.println(first+","+last);*/
        //check if array is sorted(strictly increasing)
        /* int a[]={1,2,3,4,4};
        int idx=0;
        if(checkIfSorted(a,idx)){
            System.out.println("sorted");
        }
        else{
            System.out.println("Not sorted");
        } */
       //move all 'x' to the end of the string
       /* System.out.println("ENter a string");
       String s=in.next();
       char ch='x';
       int idx=0;
       System.out.println(move(ch, idx, s)); */
       //Remove duplicates in a string
       /* boolean map[]=new boolean[26];
       System.out.println("Enter a string");
       String s=in.next();
       reverse(s.toLowerCase(), "", 0, map); */
       //print all subsequence of a string
       /* System.out.println("Enter a string:");
       String s=in.next();
       subSequence(s, 0, ""); */
       //print all unique subsequence of a string
       /* System.out.println("Enter a string:");
       String s=in.next();
       HashSet<String> set=new HashSet<>();
       subSequence(s, 0, "", set); */
       //print keyboard combinations
       System.out.println("Enter a string:");
       String s=in.next();
       printComb(s, 0, "");


       
              

        

    } 
}
