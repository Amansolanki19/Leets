class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> ht = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {

        if(st.isEmpty()){
            st.push(val);
            ht.push(val);
        }

        else{
            st.push(val);
            ht.push(Math.min(val,ht.peek()));
        }
    }
    
    public void pop() {
        st.pop();
        ht.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return ht.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */