public class MaxMinInArray {
    public static void main(String[] args) {

        int arr[] = {3,17,4,9,32,2,100};

        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){

            if(arr[i] > max)
                max = arr[i];

            if(arr[i] < min)
                min = arr[i];
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
