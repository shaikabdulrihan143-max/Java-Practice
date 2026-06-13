import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = 5;

        System.out.println("Enter Position:");
        int pos = in.nextInt();

        System.out.println("Enter Operation (0/1):");
        int oper = in.nextInt();

        if(oper == 1){

            int bitMask = 1 << pos;
            System.out.println(bitMask | n);

        } else {

            int bitMask = 1 << pos;
            System.out.println((~bitMask) & n);
        }
    }
}
