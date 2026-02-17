package numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class lc_347 {
    class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> h=new HashMap<>();
        HashMap<Integer,Integer> hc=new HashMap<>();
        for(int x:nums){
            h.put(x,h.getOrDefault(x,0)+1);

        }
        List<Integer> li=new ArrayList<>(h.keySet());
        for(int x:h.values()){
            hc.put(x,hc.getOrDefault(x,0)+1);
            //li.add(x);

        }
        Collections.sort(li, (a,b) -> h.get(b) - h.get(a));
        int count=k;
        int[] arr=new int[k];
        for(int i=0;i<k;i++){
            arr[i]=li.get(i);
        }
        
        // for(int x:li){
        //     for(int i=0;i<n;i++){
        //         if(hc.get(h.get(nums[i]))==x){
        //             count--;
        //             arr[i]=x;
        //         }

        //     }
            
        // }
        return arr;




        
    }
}
    
}



// Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

// Example 1:

// Input: nums = [1,1,1,2,2,3], k = 2

// Output: [1,2]

// Example 2:

// Input: nums = [1], k = 1

// Output: [1]

// Example 3:

// Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2

// Output: [1,2]