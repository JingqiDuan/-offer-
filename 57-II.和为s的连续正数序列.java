class Solution {
    public int[][] findContinuousSequence(int target) {
        if(target <= 0){
            return new int[0][0];
        }
        //List<List<Integer>> is wrong
        List<int[]> result = new ArrayList<>();
        int left = 1;
        int right = 1;
        int sum = 0;
        while(left <= target / 2){
            if(sum < target){
                sum += right;
                right++;
            }else if(sum > target){
                sum -= left;
                left++;
            }else{
                int[] subset = new int[right - left];
                for(int i = left; i < right; i++){
                    subset[i - left] = i;
                }
                result.add(subset);
                //don't forget to move left pointer right
                sum -= left;
                left++;
            }
        }
        //deep copy to array
        return result.toArray(new int[result.size()][]);
    }
}
