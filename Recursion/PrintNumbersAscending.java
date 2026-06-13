public class PrintNumbersAscending {

    public static void printNumberI(int n){
        if(n > 5){
            return;
        }

        System.out.println(n);
        printNumberI(n + 1);
    }

    public static void main(String[] args){
        printNumberI(1);
    }
}
