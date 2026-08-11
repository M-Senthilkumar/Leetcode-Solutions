// Last updated: 8/11/2026, 10:05:00 PM
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(target[i]!=arr[i]){
                return false;
            }
        }
        return true;
    }
}