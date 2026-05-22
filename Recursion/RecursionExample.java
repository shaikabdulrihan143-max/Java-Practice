import java.util.*;
public class Recursion {
    /* public static  void printNumberD(int n){
        if(n>0){
            System.out.println(n);
            n--;
            printNumberD(n);
        }
    } */
    /* public static void printNumberI(int n){
        if(n>5){//base case
            return;
        }
        System.out.println(n);
        printNumberI(n+1);
    } */
        /* public static int printNaturalNumbers(int n){
            
            if( n==0)
                return 0;
            return n+printNaturalNumbers(n-1);
        }
    */
    /* public static int factorial(int n){
        if(n==0)
            return 1;
        return n*factorial(n-1);
    } */
    /* public static void fibonacciSeries(int a,int b,int n,int count){
        if(count==(n-2)){
            return;
        }
        int c=a+b;
        System.out.print(" "+c);
        count++; 
        fibonacciSeries(b, c, n,count);
    } */
    /* public static int powerNaive(int x,int n){
        if(n==0)
            return 1;
        if(x==0){
            return 0;
        }
        return x*powerNaive(x, n-1);
    } */
    /* public static int powerOptimized(int x,int n){
        if(n==0)
            return 1;
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return powerOptimized(x, n/2)*powerOptimized(x, n/2);
        }
        else{
            return powerOptimized(x, n/2)*powerOptimized(x, n/2)*x;
        }
    } */
    
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        // print numbers from 5 to 1
        /* int n=5;
        printNumberD(n); */
        // print numbers from 1 to 5
        /* int n=1;
        printNumberI(n); */
        //print sum of 
        // 
        //print sum first n natural numbers
        /* System.out.println("Enter a number");
        int n=in.nextInt();
        System.out.println(printNaturalNumbers(n)); */
        //factorial of n
        /* System.out.println("Enter a number:");
        int n=in.nextInt();
        if(n<0)
            System.out.println("Not Exists");
        else
            System.out.println(factorial(n));
        */
        //print fibonacci series upto nth term
        /* System.out.println("Enter number of terms:");
        int n=in.nextInt();
        int a=0,b=1;
        if(n==1)
            System.out.println(a);
        else{
            System.out.print(a+" "+b);
            int count=0;
            fibonacciSeries(a, b, n, count);
        } */
       //print x^n(stack height=n)
        /* System.out.println("Enter x value:");
        int x=in.nextInt();
        System.out.println("Enter n value");
        int n=in.nextInt();
        System.out.println(powerNaive(x, n)); */
        //print x^n(stack height=logn)
        /* System.out.println("Enter x value:");
        int x=in.nextInt();
        System.out.println("Enter n value");
        int n=in.nextInt();
        System.out.println(powerOptimized(x, n));
        */
    }
}
