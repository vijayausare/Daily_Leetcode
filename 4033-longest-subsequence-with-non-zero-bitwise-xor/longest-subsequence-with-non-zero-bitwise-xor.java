class Solution {

    public int bruteForceSolution(int[] nums) {
        int maxLength =0;
        for(int iElement =0 ; iElement< nums.length; iElement++) { // n times
            int currentXor = 0;
            for(int jElement = iElement ; jElement< nums.length; jElement++) { // approx n times
                currentXor ^= nums[jElement];
                if(currentXor != 0) {
                    int currentLength = jElement-iElement + 1;
                    maxLength = Math.max(currentLength, maxLength);
                }
            }
        }

        return maxLength;

        /* 
        TLE
        Analysis
        Time Complexity: O(n²)
        Space Complexity: O(1)
        */ 
    }

    public int bitOptimizedSolution(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        if (xor != 0) {
            return nums.length;
        }

        for (int num : nums) {
            if (num != 0) {
                return nums.length - 1;
            }
        }

        return 0;

        /* 
        TLE
        Analysis
        Time Complexity: O(n) + O(n) = O(n)
        Space Complexity: O(1)
        */ 
    }


    public int longestSubsequence(int[] nums) {
        // return this.bruteForceSolution(nums);
        return this.bitOptimizedSolution(nums);
    }
        
}