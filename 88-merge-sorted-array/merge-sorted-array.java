class Solution {

    // brute force approach
    public void bruteForceApproach(int[] nums1, int m, int[] nums2, int n) {
    for(int i = 0; i < n; i++) {
        nums1[m + i] = nums2[i]; 
    }
    Arrays.sort(nums1);

    /*
    1. TIME COMPLEXITY: O(n) + O((m + n) * log(m + n))
        - O(n): Time taken by the for-loop to copy nums2 elements.
        - O((m + n) * log(m + n)): Time taken by DualPivotQuickSort to sort the full array.
        
        Final Time Complexity: O((m + n) * log(m + n)) 
        (We drop the O(n) because the sorting time grows much faster and dominates).

    2. SPACE COMPLEXITY: O(log(m + n))
        - The algorithm modifies nums1 in-place (no new array created).
        - However, DualPivotQuickSort uses O(log(m + n)) internal stack space for recursion.
    */
    }


    public void twoPointerApproach(int[] nums1, int m, int[] nums2, int n) {

        int[] nums1Copy = Arrays.copyOf(nums1, nums1.length);

        int p1 = 0;
        int p2 = 0;
        int idx = 0;

        while(p1 < m && p2 < n) {
            if(nums1[p1] < nums2[p2]) {
                nums1[idx] = nums1Copy[p1];
                p1++;
            } else {
                nums1[idx] = nums2[p2];
                p2++;
            }
            idx++;
        }


    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        bruteForceApproach(nums1, m , nums2, n);
    }
}