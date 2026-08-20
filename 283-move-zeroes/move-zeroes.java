class Solution {

    public void bruteForceApproach(int[] nums) {
        int[] tempArray = nums;

        int index = 0;
        for(int num: tempArray) {
            if(num!=0){
                nums[index++] = num;
            }
        }

        for(int idx = index; idx< nums.length; idx++) {
            nums[idx] = 0;
        }

        /*
        Analysis:
        Time: O(n) + O(n) = O(2n) = O(n)
        Space: O(1) ref only
        */
    }

    public void bitOptimized(int[] nums) {
        int index = 0;
        for(int num: nums) {
            if(num!=0){
                nums[index++] = num;
            }
        }

        for(int idx = index; idx< nums.length; idx++) {
            nums[idx] = 0;
        }

        /*
        Analysis:
        Time: O(n) + O(n) = O(2n) = O(n)
        Space: O(1) ref only
        */
    }

    public void twoPointerApproach(int[] nums) {
        int first = 0;
        int second = first + 1;

        while(second <= nums.length) {
            if(nums[first] == 0 && nums[second] !=0) {
                nums[first] = nums[second];
                nums[second] = 0;
                first++;
                second++;
            } else {
                second++;
            }
        }
    }

    public void moveZeroes(int[] nums) {
        // this.bruteForceApproach(nums);
        this.bitOptimized(nums);
    }
}