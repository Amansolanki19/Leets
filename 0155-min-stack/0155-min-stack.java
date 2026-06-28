import java.util.Stack;

class MinStack {

    private Stack<Long> stack;
    private long min;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int value) {

        if (stack.isEmpty()) {
            stack.push((long) value);
            min = value;
        } 
        else if (value >= min) {
            stack.push((long) value);
        } 
        else {
            // Encode the value
            stack.push(2L * value - min);
            min = value;
        }
    }

    public void pop() {

        long top = stack.pop();

        // Encoded value
        if (top < min) {
            min = 2 * min - top;
        }
    }

    public int top() {

        long top = stack.peek();

        if (top < min) {
            return (int) min;
        }

        return (int) top;
    }

    public int getMin() {
        return (int) min;
    }
}