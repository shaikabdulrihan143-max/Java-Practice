import java.util.*;

public class UniqueSubsets {
    public static HashSet<List<Integer>> set=new HashSet<>();
    public static void printSubsets(int nums[],int idx,List<Integer> subset){
        if(idx==nums.length){
            if(set.contains(subset)){
                return;
            }
            else{
                set.add(subset);
                System.out.println(subset);
                return;
            }
            
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
        int[] nums={1,4,4,4,1,4};
        Arrays.sort(nums);
        List<Integer> subset=new ArrayList<>();
        printSubsets(nums,0,subset);
    }
}
