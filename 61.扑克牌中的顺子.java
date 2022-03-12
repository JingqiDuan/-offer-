class Solution {
    public boolean isStraight(int[] nums) {
        if(nums == null || nums.length != 5){
            return false;
        }
        //no repeats, max - min < 5
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        int min = 14;
        for(int n : nums){
            if(n == 0)
                continue;
            
            if(set.contains(n)){
                return false;
            }else{
                set.add(n);
            }
            
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min < 5;
    }
}
