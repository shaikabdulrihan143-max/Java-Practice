import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {

        int arr[][] = {
            {1,2},
            {3,4},
            {5,6},
            {7,8}
        };

        int transpose[][] = new int[arr[0].length][arr.length];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println(Arrays.deepToString(transpose));
    }
}
