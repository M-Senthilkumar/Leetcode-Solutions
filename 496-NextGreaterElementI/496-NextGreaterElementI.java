// Last updated: 8/11/2026, 10:07:12 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         int n = nums1.length;
        int m = nums2.length;
        int[] arr = new int[n];

        boolean Flag = false;


        for(int i = 0; i < n; i++){
            arr[i] = -1;
            Flag = false;
            for(int j = 0; j < m; j++){
                if(nums1[i] == nums2[j]){
                    for(int k = j; k < m; k++){
                        if(nums1[i] < nums2[k]){
                            arr[i] = nums2[k];
                            Flag = true;
                            break;
                        }
                    }
                }
                if(Flag){
                    break;
                }
            }
        }
        return arr;
    }
}