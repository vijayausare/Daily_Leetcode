class Solution {

    public boolean reverseStringApproach(String s) {
        String normalized = s.replaceAll("[^a-zA-Z0-9]", "") // ^ not, a-b, A-Z & 0-9
                                .toLowerCase();
        String reversed = new StringBuilder(normalized)
                        .reverse()
                        .toString();

        return normalized.equals(reversed);

        /*
        1. TIME COMPLEXITY: O(n)

        - Removing non-alphanumeric characters: O(n)
        - Converting to lowercase: O(n)
        - Creating and reversing StringBuilder: O(n)
        - Creating the reversed String: O(n)
        - Comparing the strings: O(n)

        Final Time Complexity: O(n)


        2. SPACE COMPLEXITY: O(n)

        - The normalized String requires O(n) space.
        - StringBuilder requires O(n) space.
        - The reversed String requires O(n) space.

        Final Auxiliary Space Complexity: O(n)
        */

    }
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
        return reverseStringApproach(s);
        // return towPointerApproach(s);
    }
}