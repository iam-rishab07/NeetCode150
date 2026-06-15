package TwoPointer;

public class TrapRainWater {
    // optimal approach      T.C.= O(n)    S.C.= O(1)
    public int trapWater(int[] heights)
    {
        int totalWater = 0;
        int left = 0, right = heights.length-1;
        int leftMax = heights[left], rightMax = heights[right];
        while(left<right)
        {
            if(leftMax<rightMax)
            {
                left++;
                leftMax = Math.max(leftMax,heights[left]);
                totalWater+=leftMax-heights[left];
            }else{
                right--;
                rightMax = Math.max(rightMax,heights[right]);
                totalWater+=rightMax-heights[right];
            }
        }
        return totalWater;
    }

    // brute force    T.C.= O(n*n)    S.C.=O(1)
    public int trap(int[] heights)
    {
        int totalWater = 0;
        int left = 0, right = heights.length;
        int leftMax = heights[left], rightMax = heights[right];
        for(int i=0;i<heights.length;i++)
        {
            for(int j=1;i<heights.length;i++)
            {
                leftMax = Math.max(leftMax,heights[j]);
            }
            for(int k = heights.length-2;k>=0;k--)
            {
                rightMax = Math.max(rightMax,heights[k]);
            }
            int minHeight = Math.min(leftMax,rightMax);
            totalWater+=minHeight-heights[i];
        }
        return totalWater;
    }
}
