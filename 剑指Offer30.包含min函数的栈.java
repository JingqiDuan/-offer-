class MinStack {
    Stack<Integer> stack1, stack2;
    /** initialize your data structure here. */

    public MinStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>(); //use stack2 to store min
    }
    
    public void push(int x) {
        stack1.push(x);
        if(stack2.empty() || x <= stack2.peek()){//include the x= case
            stack2.push(x);
        }
    }
    
    public void pop() {
        if(stack1.peek().equals(stack2.peek())){
            stack2.pop();
        }
        stack1.pop();
    }
    
    public int top() {
        return stack1.peek();
    }
    
    public int min() {
        return stack2.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */
