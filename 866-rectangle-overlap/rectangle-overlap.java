class Solution {

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

        int commonLeft = Math.max(rec1[0], rec2[0]);
        int commonRight = Math.min(rec1[2], rec2[2]);

        int commonBottom = Math.max(rec1[1], rec2[1]);
        int commonTop = Math.min(rec1[3], rec2[3]);

        int commonWidth = commonRight - commonLeft;
        int commonHeight = commonTop - commonBottom;

        return commonWidth > 0 && commonHeight > 0;
    }
}