class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for(int n : pushed){
            stack.push(n);
            while(!stack.isEmpty() && popped[index] == stack.peek()){
                stack.pop();
                index++;
            }
        }
        return stack.isEmpty();
    }
}
