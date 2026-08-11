// Last updated: 8/11/2026, 10:05:56 PM
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return (rec1[0] < rec2[2] && rec1[1] < rec2[3] && rec1[2] > rec2[0] &&  rec1[3] > rec2[1]);
    }
}