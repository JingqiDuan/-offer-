class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        return findRight(nums, target) - findLeft(nums, target);
    }
    private int findLeft(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] >= target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return left;
    }

    private int findRight(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] <= target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return left;
    }
}
