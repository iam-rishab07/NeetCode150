package SlidingWindow;


// sliding window maximum
import java.util.*;
public class SWMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //edge cases
        if(nums==null || k<=0) return new int[0];

        int n=nums.length;
        int res[]=new int[n-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            // remove the indices that are out of current window
            while(!dq.isEmpty() && dq.peek()<i-k+1)
            {
                dq.poll();
            }

            // remove the indices whose corresponding elements are less than nums[i]
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i])
            {
                dq.pollLast();
            }
            dq.offer(i);

            if(i>=k-1)
            {
                res[i-k+1] = nums[dq.peek()];
            }
        }
        return res;
    }
}
