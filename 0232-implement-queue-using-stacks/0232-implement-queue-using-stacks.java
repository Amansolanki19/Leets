class MyQueue {

    Stack<Integer> first =new Stack<>();
    Stack<Integer> second=new Stack<>();

    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(first.isEmpty()) first.push(x);

        else{
            while(!first.isEmpty())     second.push(first.pop());

            first.push(x);

            while(!second.isEmpty())    first.push(second.pop());    
        }
    }
    
    public int pop() {
        return first.pop();
    }
    
    public int peek() {
        return first.peek();
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */