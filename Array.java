import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        // int a[]=new int[3];
        // a[0]=2;
        // a[1]=3;
        // a[2]=4;
        // int c[]={1,2,3,4,5};
        // printing 1-d array
        // System.out.println(Arrays.toString(a));
        // Without pre defined function
        // for(int i=0;i<a.length;i++)
        //     System.out.print(a[i]+" ");
        // for(int i=0;i<c.length;i++)
        //      System.out.print(c[i]+" ");
        //2-d array
        // int[][] b=new int[2][2];
        // b[0][0]=1;
        // b[0][1]=2;
        // b[1][0]=4;
        // b[1][0]=6;
        //print 2-d array
        // System.out.println(Arrays.deepToString(b));
        //Without pre defined function
        // for(int i=0;i<b.length;i++){
        //     for(int j=0;j<b.length;j++){
        //         System.out.print(b[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // user give inputs into 1-d array
        // System.out.println("Enter Size of the array:");
        // int size=in.nextInt();
        // int numbers[]=new int[size];
        // for(int i=0;i<size;i++){
        //     numbers[i]=in.nextInt();
        // }
        // for(int i=0;i<size;i++){
        //     System.out.print(numbers[i]+" ");
        // }
        //user give inputs into 2-d array
        /* System.out.println("Enter number of rows:");
        int rows=in.nextInt();
        System.out.println("Enter number of columns");
        int cols=in.nextInt();
        int a[][]=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                a[i][j]=in.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(a)); */
        // int a[][]={{1,2},{3,4},{5,6}};
        // System.out.println(Arrays.deepToString(a));
        // searching and printing the index of that key in 1-d array
        /* System.out.println("Enter Size of the array:");
        int size=in.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=in.nextInt();
        }
        System.out.println("Enter element to be searched:");
        int key=in.nextInt();
        for(int i=0;i<size;i++){
            if(key==numbers[i]){
                System.out.println("Index: "+i);
                break;
            }
        } */
        // searching and printing the index of that key in 1-d array
        /* int a[][]={{1,2},{3,4},{5,6}};
        System.out.println("Enter element to be searched:");
        int key=in.nextInt();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(key==a[i][j]){
                    System.out.println("Index: "+i+","+j);
                    break;
                }
            }
        } */
        //finding maximum and minimum integer in an array
        /* int test[]={3,17,4,9,32,2,100};
        int temp;
           //sorting array
           for(int i=0;i<test.length;i++){
            for(int j=i+1;j<test.length;j++){
                if(test[i]>test[j]){
                    temp=test[i];
                    test[i]=test[j];
                    test[j]=temp;
                }
            }
           }
        System.out.println("Max: "+test[test.length-1]);
        System.out.println("Min: "+test[0]); */
        // cheking array is sorted or not
        /* int test[]={1,2,3,5};
        boolean flag=true;
        for(int i=0;i<test.length-1;i++){
            if(test[i]>test[i+1]){
                flag=false;
                break;
            }
        }
        if(flag)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
        */
        //transpose of 2-d array
        /* int a[][]={{1,2},{3,4},{5,6},{7,8}};
        int b[][]=new int[a[0].length][a.length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                b[j][i]=a[i][j];
            }
        }
        System.out.println(Arrays.deepToString(b)); */
        

        

    }
}
