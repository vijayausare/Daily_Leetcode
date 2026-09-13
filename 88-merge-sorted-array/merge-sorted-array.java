class Solution {

    // brute force approach
    public void bruteForceApproach(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i< n; i++) {
            nums1[m + i] = nums2[i]; 
        }
        Arrays.sort(nums1);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        bruteForceApproach(nums1, m , nums2, n);
    }
}