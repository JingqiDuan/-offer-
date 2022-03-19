class Solution {
    /*public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int lastIndex = nums.length - 1;
        return nums[(lastIndex + 1) / 2];
    }*/
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];
        for(int n : nums){
            if(count == 0){
                candidate = n;
            }
            if(candidate == n){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}
