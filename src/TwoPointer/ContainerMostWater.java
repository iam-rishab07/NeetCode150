package TwoPointer;

public class ContainerMostWater {
    public int maxArea(int[] heights)
    {
        int maxArea = 0;
        int left = 0, right = heights.length-1;
        while(left<right)
        {
            int currHeight = Math.min(heights[left],heights[right]);
            int width = right - left;
            int area = width*currHeight;
            maxArea = Math.max(area,maxArea);

            //skip heights less than current height
            while(left<right && heights[left]<=currHeight) left++;
            while(left<right && heights[right]<=currHeight) right--;
        }

        return maxArea;
    }
}

