class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0 || k == 0){
            return new int[0];
        }
        int[] result = new int[nums.length - k + 1];
        int left = 0, right = k - 1;
        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();
        while(right <= nums.length - 1){
            if(queue.size() == 0){
                for(int i = left; i <= right; i++){
                    queue.offer(nums[i]);
                    while(!deque.isEmpty() && deque.peekLast() < nums[i]){
                        deque.pollLast();
                    }
                    deque.offerLast(nums[i]);
                }
            }
            if(queue.size() == k - 1){
                queue.offer(nums[right]);
                while(!deque.isEmpty() && deque.peekLast() < nums[right]){
                    deque.pollLast();
                }
                deque.offerLast(nums[right]);
            }
            //get max
            int maxVal = deque.peekFirst();
            result[left] = maxVal;
            //poll()
            int tmp = queue.poll();
            if(!deque.isEmpty() && tmp == deque.peekFirst()){
                deque.pollFirst();
            }
            left++;
            right++;
        }
        return result;
    }
}
