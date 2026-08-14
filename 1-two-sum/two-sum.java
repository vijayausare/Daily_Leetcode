class Solution {
    public int[] twoSum(int[] nums, int target) {
        // for(int i =0; i < nums.length-1 ; i++) {
        //     for(int j = i+1 ; j< nums.length; j++)
        //         if(nums[i]+ nums[j]== target) {
        //             return new int[]{i, j};
        //         }
        // }
        // return new int[]{-1, -1};

        Map<Integer, Integer> mp = new HashMap<>();
    
        for (int i = 0 ; i< nums.length; i++) {
            int c = target - nums[i];

            if(mp.containsKey(c)) {
                return new int[] {mp.get(c), i};
            }

            mp.put(nums[i], i);
        }

        return new int[] {};
    }
}