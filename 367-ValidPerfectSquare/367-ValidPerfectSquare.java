// Last updated: 8/11/2026, 10:07:58 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;

        while(left <= right){

            int mid = left + (right - left) / 2;

            long square = (long) mid * mid;

            if(square == num){
                return true;
            }

            else if(square > num){
                right = mid - 1;
            }

            else{
                left = mid + 1;
            }
        }

        return false;
    }
}