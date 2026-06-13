import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Size:");
        int n = in.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Enter Key:");
        int key = in.nextInt();

        for(int i = 0; i < n; i++){
            if(arr[i] == key){
                System.out.println("Index: " + i);
                return;
            }
        }

        System.out.println("Not Found");
    }
}
