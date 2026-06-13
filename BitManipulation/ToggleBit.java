import java.util.Scanner;

public class ToggleBit {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Number:");
        int n = in.nextInt();

        System.out.println("Enter Position:");
        int pos = in.nextInt();

        int bitMask = 1 << pos;

        System.out.println(n ^ bitMask);
    }
}
