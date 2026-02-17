// You are given an integer array nums.

// Return an integer denoting the first element (scanning from left to right) in nums whose frequency is unique. That is, no other integer appears the same number of times in nums. If there is no such element, return -1.

 

// Example 1:

// Input: nums = [20,10,30,30]

// Output: 30

// Explanation:

// 20 appears once.
// 10 appears once.
// 30 appears twice.
// The frequency of 30 is unique because no other integer appears exactly twice.

package numbers;


import java.util.HashMap;

public class lc_3843 {
    
    public int firstUniqueFreq(int[] nums) {
        boolean check=true;
        HashMap<Integer,Integer> h=new HashMap<>();
        HashMap<Integer,Integer> fcount=new HashMap<>();
        

        for(int x:nums){
            h.put(x,h.getOrDefault(x,0)+1);

        }
        for(int x:h.values()){
            fcount.put(x,fcount.getOrDefault(x,0)+1);
        }
        for(int x:nums){
           if(fcount.get(h.get(x))==1){
            return x;
           }
        }
        return -1;
    }
}
    