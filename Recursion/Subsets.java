//Recursive approach
import java.util.*;
public class Subsets {
    public static void printSubsets(int nums[],int idx,List<Integer> subset){
        if(idx==nums.length){
            System.out.println(subset);
            return;
        }
        int ele=nums[idx];
        //include
        subset.add(ele);
        printSubsets(nums, idx+1, subset);
        //exclude
        subset.remove(subset.size()-1);
        printSubsets(nums, idx+1, subset);
    }
    public static void main(String[] args){
        int[] nums={1,2,3};
        List<Integer> subset=new ArrayList<>();
        printSubsets(nums,0,subset);
    }
}
