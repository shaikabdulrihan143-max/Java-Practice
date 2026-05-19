import java.util.*;
public class patterns {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //int n =sc.nextInt();
        /* * * * * *
           * * * * *
           * * * * *
           * * * * *  */
        // for(int i=0;i<4;i++){
        //     for(int j=0;j<5;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        /* * * * * *
           *       *
           *       *
           * * * * *
        */
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=5;j++){
        //         if(i==1||j==1||i==4||j==5){//boundaries only prints
        //             System.out.print("* ");
        //         }
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
            
        // }
        /* *
           * *
           * * *
           * * * *
         */
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        /* * * * *
           * * *
           * *
           * 
        */
        //for(int i=4;i>0;i--){
        //  for(int j=i;j>0;j--){
        //        System.out.print("* ");
        //   }
        //   System.out.println();
        //}
        /*    *
            * *
          * * *
        * * * *
         */
        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int k=1;k<=(n-i);k++){//for spaces
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        /* 1
           1 2
           1 2 3
           1 2 3 4
           1 2 3 4 5
         */
        // int num=1;
        // for(int i=1;i<=5;i++){
        //     num=1;
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num);
        //         num++;
        //     }
        //     System.out.println();
        // }
        /* 5 4 3 2 1
           4 3 2 1
           3 2 1
           2 1
           1
         */
        // for(int i=5;i>0;i--){
        //     for(int j=i;j>0;j--){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        /* 1 2 3 4 5
           1 2 3 4
           1 2 3
           1 2
           1
         */
        // for(int i=5;i>0;i--){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }
        /* 1
           2  3
           4  5  6
           7  8  9  10 11
           11 12 13 14 15
         */
        // int num=1;
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(num+"\t");
        //         num++;
        //     }
        //     System.out.println();
        // }
        /* 1
           0 1
           1 0 1
           0 1 0 1
           1 0 1 0 1
         */
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    

}
