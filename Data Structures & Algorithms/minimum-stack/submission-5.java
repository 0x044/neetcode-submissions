class MinStack {
    LinkedList<Integer> stack;
    LinkedList<Integer> minTracker;
    public MinStack() {
        stack = new LinkedList<>();
        minTracker = new LinkedList<>();
    }
    
    public void push(int val) {
        if(!minTracker.isEmpty() && minTracker.peekFirst() >= val){
            minTracker.push(val);
            stack.push(val);
        }else if(minTracker.isEmpty()){
            stack.push(val);
            minTracker.push(val);
        }else{
            stack.push(val);
        }
    }
    
    public void pop() {
        if(!stack.isEmpty() && !minTracker.isEmpty() && Objects.equals(minTracker.getFirst(), stack.getFirst())) {
            stack.pop();
            minTracker.pop();
        }else if(!stack.isEmpty()){
            stack.pop();
        }
    }
    
    public int top() {
        if(!stack.isEmpty()){
            return stack.getFirst();
        }
        return 0;
    }
    
    public int getMin() {
        if(!minTracker.isEmpty()){
            return minTracker.getFirst();
        }
        return 0;
    }
}
