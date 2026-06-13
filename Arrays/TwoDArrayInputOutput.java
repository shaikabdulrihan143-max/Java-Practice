import java.util.Scanner;
import java.util.Arrays;

public class TwoDArrayInputOutput {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Rows:");
        int rows = in.nextInt();

        System.out.println("Enter Columns:");
        int cols = in.nextInt();

        int arr[][] = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }
}
