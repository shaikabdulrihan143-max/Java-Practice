public class PalindromicPattern {
    public static void main(String[] args){

        /*      1
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5
        */

        int n=5;

        for(int i=1;i<=n;i++){

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j=i;j>0;j--){
                System.out.print(j+"");
            }

            if(i>1){
                for(int j=i;j>1;j--){
                    System.out.print(j+"");
                }
            }

            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
