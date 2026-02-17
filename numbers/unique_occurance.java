// Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

 

// Example 1:

// Input: arr = [1,2,2,1,1,3]
// Output: true
// Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
// Example 2:

// Input: arr = [1,2]
// Output: false
// Example 3:

// Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
// Output: true

package numbers;
import java.util.*;


class unique_occurance {
    
    public boolean uniqueOccurrences(int[] arr) {
        int n = arr.length;
        HashMap<Integer,Integer> h = new HashMap<>();
        HashSet<Integer> s = new HashSet<>();
        
        for(int x : arr){
            h.put(x, h.getOrDefault(x,0) + 1);
        }
        
        
        for(int x : h.values()){
            s.add(x);
        }
        for(int x:s){
            System.out.println(x);
        }
        
        if(s.size() != h.size()){
            return false;
        }
        
        
        
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        unique_occurance obj = new unique_occurance();
        boolean result = obj.uniqueOccurrences(arr);
        
        System.out.println(result);
    }
}
