public class CheckSortedArrayRecursion {

    public static boolean checkIfSorted(int a[],int idx){

        if(idx==a.length-1){
            return true;
        }

        if(a[idx]>=a[idx+1])
            return false;

        return checkIfSorted(a,idx+1);
    }

    public static void main(String[] args){

        int a[]={1,2,3,4,4};

        if(checkIfSorted(a,0)){
            System.out.println("sorted");
        }
        else{
            System.out.println("Not sorted");
        }
    }
}
