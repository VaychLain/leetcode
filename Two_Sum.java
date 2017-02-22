package leetcode;

import java.util.HashMap;
import java.util.Map;


public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,4,2,0};
		
		int[] solve = new  Two_Sum().twoSum(nums,0);
		System.out.println("["+solve[0]+", "+solve[1]+"]");
	}
	
	public int[] twoSum(int[] nums, int target) {
		Map <Integer, Integer>  map = new HashMap<>();
		for (int i=0;i<nums.length;i++){
			map.put(nums[i], i);
		}
		for (int i=0;i<nums.length;i++){
			int diff = target - nums[i];
			if (map.containsKey(diff)&&map.get(diff)!=i)
				return new int[] { i, map.get(diff) };
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	
}
