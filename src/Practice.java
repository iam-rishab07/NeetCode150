import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.lang.Character.isLetterOrDigit;

public class Practice {
    public int[] productExceptSelf(int[] nums)
    {
        int pre = 1;
        int post = 1;
        int[] ans = new int[nums.length];
        Arrays.fill(ans,1);
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = pre;
            pre = pre*nums[i];
        }
        for(int j=nums.length-1;j>=0;j--)
        {
            ans[j]*=post;
            post*=nums[j];
        }
        return ans;
    }
}
