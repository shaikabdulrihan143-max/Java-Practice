import java.util.*;

public class Functions {
    // public static void Factorial(int n){
    //     if(n<0){
    //         System.out.println("Invalid Choice");
    //         return;
    //     }
    //     int result=1;
    //     for(int i=n;i>0;i--)
    //         result*=i;
    //     System.out.println("Factorial of "+n+" is "+result);
    // }
    // public static void printAverage(int a, int b, int c){
    //     System.out.println((a+b+c)/3);
    // }
    // public static void sumOddNumbers(int n){
    //     int sum=0;
    //     for(int i=1;i<=n;i++){
    //         if(i%2==1)
    //             sum+=i;
    //     }
    //     System.out.println(sum);
    // }
    // public static int greatest(int a, int b){
    //     if(a>b)
    //         return a;
    //     else
    //         return b;
    // }
    // public static void circumferenceOfCircle(int r){
    //     double c=2*3.14*r;
    //     System.out.println(c);
    // }
    // public static void eligibleToVote(int age){
    //     if(age>=18)
    //         System.out.println("Eligible to vote");
    //     else
    //         System.out.println("Not Eligible to vote");
    // }
    // public static void infiniteDoWhileLoop(){
    //     do{
    //         System.out.println("INFINITE LOOP");
    //     }while(true);
    // }
    // public static void power(int x,int n){
    //     System.out.println(Math.pow(x,n));
    // }
    // public static void GCD(int a,int b){
    //      while(a!=b){
    //         if(a>b){
    //             a=a-b;
    //         }
    //         else{
    //             b=b-a;
    //         }
    //      }
    //      System.out.println("GCD OF TWO NUMBERS:"+b);
    // }
    public static void fibonacciSeries(int n){
        int a=0,b=1,k;
        System.out.print(a+" "+b+" ");
        int count=2;
        while(count<n){
            k=a+b;
            System.out.print(k+" ");
            a=b;
            b=k;
            count+=1;
            
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        //int n2=in.nextInt();
        // int n3=in.nextInt();
        //Factorial(n1);
        //printAverage(n1,n2,n3);
        //sumOddNumbers(n1);
        //System.out.println(greatest(n1,n2));
        //circumferenceOfCircle(n1);
        //eligibleToVote(n1);
        //infiniteDoWhileLoop();
        //power(n1, n2);
        /* Write a program to enter the numbers till the user wants 
        and at the end it should display the count of positive, negative and zeros entered
         */
        // int p=0,n=0,z=0;
        // int n1,n2;
        // System.out.println("Enter 0 to exit & 1 to start");
        // n1=in.nextInt();
        // System.out.println("Enter inputs");
        // while(n1==1){
        //     n2=in.nextInt();
        //     if(n2>0)
        //         p+=1;
        //     else if(n2<0)
        //         n+=1;
        //     else
        //         z+=1;
        //     System.out.println("Enter 0 to exit & 1 to start");
        //     n1=in.nextInt();
        // }
        // System.out.println("Positive:"+p+" Negatives:"+n+" Zeroes:"+z);
        //GCD(n1, n2);
        fibonacciSeries(n1);
    }
}

