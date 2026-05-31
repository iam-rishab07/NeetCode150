package ArraysAndHashing;

import java.util.*;
public class ExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length==0) return new int[] {};

        int[] result = new int[nums.length];
        Arrays.fill(result,1);
        int pre = 1;
        int post = 1;
        for(int i=0;i<nums.length;i++)
        {
            result[i] = pre;
            pre*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            result[i]*=post;
            post*=nums[i];
        }
        return result;
    }
}
