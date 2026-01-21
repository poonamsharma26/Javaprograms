import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum2Pointer {
    public static void main(String[] args) {
        int[] list = TwoSum2Pointer(new int[]{3,4,5,6},7);
        System.out.println(list);
    }

    public static int[] TwoSum2Pointer(int[] nums, int target) {
        // code here
        int leftPointer = 0;
        int rightPointer = nums.length-1;
        int[] res = new int[2];

        while(leftPointer < rightPointer){
            if(nums[leftPointer]+nums[rightPointer] > target){
                rightPointer--;
            }else if(nums[leftPointer]+nums[rightPointer] < target){
                leftPointer++;
            }
            else{
                res[0]=leftPointer;
                res[1]=rightPointer;
                leftPointer++;
                rightPointer--;
            }
        }
        return res;
    }
}
