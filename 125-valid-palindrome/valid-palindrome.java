class Solution {
    public boolean towPointerApproach(String s) {
        int end = s.length() - 1;
        int start = 0;

        while(start < end) {
            while(
                start < end && 
                !Character.isLetter(s.charAt(start)) && 
                !Character.isDigit(s.charAt(start))
            ) {
                start++;
            }

            while(
                start < end && 
                !Character.isLetterOrDigit(s.charAt(end))
            ) {
                end--;
            }

            char left = Character.toLowerCase(s.charAt(start));
            char right = Character.toLowerCase(s.charAt(end));

            if (left != right) {
                return false;
            }

            start++;
            end--;
        }

        return true;

         /*
        1. TIME COMPLEXITY: O(n)

           - The start pointer moves only from left to right.
           - The end pointer moves only from right to left.
           - Each character is examined at most a constant number
             of times.
           - Although there are nested while-loops, the pointers
             never move backwards or restart.

           Final Time Complexity: O(n)


        2. SPACE COMPLEXITY: O(1)
        */
        
    }

    public boolean isPalindrome(String s) {
        return towPointerApproach(s);
    }
}