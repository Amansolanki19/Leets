class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int point = 0;

        for(int a:pushed){
            stack.push(a);
            while(!stack.isEmpty() && stack.peek()==popped[point]){
                stack.pop();
                point++;
            }
        }
        return stack.isEmpty();
    }
}