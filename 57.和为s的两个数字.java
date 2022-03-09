class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            if(nums[left] < target - nums[right]){
                left++;
            }else if(nums[left] > target - nums[right]){
                right--;
            }else{
                return new int[]{nums[left], nums[right]};
            }
        }
        return new int[]{-1, -1};
    }
}
