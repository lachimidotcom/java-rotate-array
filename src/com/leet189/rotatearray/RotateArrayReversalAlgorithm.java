package com.leet189.rotatearray;

public class RotateArrayReversalAlgorithm {
	
	   public void rotate(int[] nums, int k) {
	        if (nums == null || k < 0) {
	            throw new IllegalArgumentException("Illegal argument!");
	        }

	        int n = nums.length;
	        k = k % n; 

	        reverse(nums, 0, n - 1); 
	        reverse(nums, 0, k - 1); 
	        reverse(nums, k, n - 1); 
	    }

	    private void reverse(int[] nums, int start, int end) {
	        while (start < end) {
	            int temp = nums[start];
	            nums[start] = nums[end];
	            nums[end] = temp;
	            start++;
	            end--;
	        }
	    }

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		RotateArrayReversalAlgorithm solution = new RotateArrayReversalAlgorithm();
		solution.rotate(nums, k);

		// Optional: Print the rotated array to verify the result
		for (int num : nums) {
			System.out.print(num + " ");
		}
	}
}
