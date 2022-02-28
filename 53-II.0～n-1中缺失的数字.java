class Solution {
    public int missingNumber(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(mid == nums[mid]){
                left = mid + 1;
            }else if(mid < nums[mid]){
                right = mid - 1;
            }
        }
        return left;
    }
}
