import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int arr[][] = {
            {1,2},
            {3,4},
            {5,6}
        };

        System.out.println("Enter Key:");
        int key = in.nextInt();

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                if(arr[i][j] == key){
                    System.out.println("Index: " + i + "," + j);
                    return;
                }
            }
        }

        System.out.println("Not Found");
    }
}
