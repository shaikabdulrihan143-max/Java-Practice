public class SetBit {
    public static void main(String[] args) {

        int n = 5;
        int pos = 3;

        int bitMask = 1 << pos;

        System.out.println(bitMask | n);
    }
}
