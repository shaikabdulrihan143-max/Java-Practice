import java.util.*;
public class Advancepattern {
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        /* *             *
           * *         * *
           * * *     * * *
           * * * * * * * *
           * * * * * * * *
           * * *     * * *
           * *         * *
           *             *
         */
        // int n=4;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){//part 1(stars)
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=2*(n-i);k++){//spaces
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=i;j++){//part 2(stars)
        //         System.out.print("* ");
        //     }
        //     System.out.println();

        // }
        // for(int i=n;i>0;i--){
        //     for(int j=i;j>0;j--){
        //         System.out.print("* ");
        //     }
        //     for(int k=1;k<=2*(n-i);k++){
        //         System.out.print("  ");
        //     }
        //     for(int j=i;j>0;j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();

        // }
        /*      * * * * *
              * * * * *
            * * * * *
          * * * * *
        * * * * *
         */
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i);j++){//part 1(spaces)
        //         System.out.print("  ");
        //     }
        //     for(int j=1;j<=n;j++){//stars
        //         System.out.print("* ");
        //     }
        //     for(int j=1;j<=(i-1);j++){//part 2(spaces)
        //         System.out.print("  ");
        //     }
        //     System.out.println();
        // }
        /*  1
           2 2
          3 3 3    
         4 4 4 4
        5 5 5 5 5
        */
        //int n=5;
        //for(int i=1;i<=n;i++){
        //  for(int j=1;j<=(n-i);j++){
        //      System.out.print("  ");
        //   }
        //   for(int j=1;j<=i;j++){
        //      System.out.print(i+"   ");
        //   }
        //   for(int j=1;j<=(n-i);j++){
        //      System.out.print("  ");
        //   }
        //   System.out.println();
        //}
        /*      1
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5
         */
        // int n=5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i;j>0;j--){
        //         System.out.print(j+"");
        //     }
        //     if(i>1){
        //         for(int j=i;j>1;j--){
        //             System.out.print(j+"");
        //         }
        //     }
        //     for(int j=1;j<=(n-i);j++){
        //         System.out.print(" ");
        //     }
        //     System.out.println();
        // }
        /*    *
            * * *
          * * * * *
        * * * * * * *
        * * * * * * *
          * * * * *
            * * *
              *
         */
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*(i-1)+1;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*(i-1)+1;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            System.out.println();
        }


    }
}
