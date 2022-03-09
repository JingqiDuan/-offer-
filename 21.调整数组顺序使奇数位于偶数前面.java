class Solution {
    public int[] exchange(int[] nums) {
        if(nums.length == 0 || nums == null){
            return new int[0];
        }
        int[] answer = new int[nums.length];
        Queue<Integer> queue = new LinkedList<>();
        int left = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                answer[left] = nums[i];
                left++;
            }else{
                queue.offer(nums[i]);
            }
        }
        for(int i = left; i < nums.length; i++){
            answer[i] = queue.poll();
        }
        return answer;
    }
}
