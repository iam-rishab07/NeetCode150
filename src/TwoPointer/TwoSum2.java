package TwoPointer;

// given a sorted array and a target,return position of two numbers adding up to target
public class TwoSum2 {
    public int[] twoSum2(int[] nums, int target)
    {
        int left = 0, right = nums.length-1;
        while(left<right)
        {
            int sum = nums[left]+nums[right];
            if(sum==target)
            {
                return new int[] {left+1,right+1};
            }else if(sum<target) left++;
            else right--;
        }
        return new int[] {};
    }
}
