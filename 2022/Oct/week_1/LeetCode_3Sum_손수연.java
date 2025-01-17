package Oct_2022;

import java.util.*;

public class Solution_LeetCode_3Sum {
	
	public List<List<Integer>> threeSum(int[] nums) {

	    Set<List<Integer>> set = new HashSet<>();
	    
	    if(nums == null || nums.length < 3) return new ArrayList<>(set);

	    Arrays.sort(nums);
	    
	    for (int i = 0; i < nums.length-2; i++) {
	       int j = i + 1;
	       int k = nums.length - 1;
	       
	       while (j < k){
	           int sum = nums[i] + nums[j] + nums[k];
	           
	           if(sum == 0) set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
	           else if(sum < 0) j++;
	           else if(sum > 0) k--;
	       }
	    }
	    
	    return new ArrayList<>(set);
	}
}