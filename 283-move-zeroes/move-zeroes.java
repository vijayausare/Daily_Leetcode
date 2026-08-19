class Solution {

    public void bruteForceApproach(int[] nums) {
        int[] temp = nums;

        int index = 0;
        for(int num: temp) {
            if(num!=0){
                nums[index++] = num;
            }
        }

        for(int i = index; i< nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroes(int[] nums) {
        this.bruteForceApproach(nums);
    }
}