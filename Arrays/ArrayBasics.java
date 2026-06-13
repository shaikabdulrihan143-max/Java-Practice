import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));

        int b[][] = {
            {1, 2},
            {3, 4}
        };

        System.out.println(Arrays.deepToString(b));
    }
}
