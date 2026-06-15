package ArraysAndHashing;

import java.util.*;
public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        if(k==nums.length) return nums;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        // create priority queue that stores elements in ascending order
        Queue<Integer> minHeap = new PriorityQueue<>(
                (a,b)-> map.get(a)-map.get(b)
        );

        for(int n : map.keySet())
        {
            minHeap.add(n);
            if(minHeap.size()>k)
            {
                minHeap.poll();
            }
        }

        int[] res = new int[k];
        for(int i=0;i<k;i++)
        {
            res[i] = minHeap.poll();
        }
        return res;
    }
}
