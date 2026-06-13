public class NumberPyramid1 {
    public static void main(String[] args){

        /* 1
           12
           123
           1234
           12345
        */

        int num=1;

        for(int i=1;i<=5;i++){
            num=1;
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
