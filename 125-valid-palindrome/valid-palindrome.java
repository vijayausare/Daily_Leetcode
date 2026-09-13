class Solution {

    public boolean towPointerApproach(String s) {

        s = s.trim();
        if(s.isEmpty()) return true;
        char[] chars = s.toCharArray();
        int end = s.length() - 1;
        int start = 0;

        while(start < end) {
            while(
                start < end && 
                !Character.isLetter(chars[start]) && 
                !Character.isDigit(chars[start])
            ) {
                start++;
            }

            while(
                start < end && 
                !Character.isLetter(chars[end]) &&
                !Character.isDigit(chars[end])
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
        
    }

    public boolean isPalindrome(String s) {
        return towPointerApproach(s);
    }
}