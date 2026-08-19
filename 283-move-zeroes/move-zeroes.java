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
    }

    public void moveZeroes(int[] nums) {
        this.bruteForceApproach(nums);
    }
}