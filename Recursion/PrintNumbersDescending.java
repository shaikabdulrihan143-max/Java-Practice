public class PrintNumbersDescending {

    public static void printNumberD(int n){
        if(n > 0){
            System.out.println(n);
            printNumberD(n - 1);
        }
    }

    public static void main(String[] args){
        printNumberD(5);
    }
}
