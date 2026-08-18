class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length() - s.lastIndexOf(" ") -1;
        // String[] arr = s.split(" ");
        // return arr[arr.length -1].length();
    }
}