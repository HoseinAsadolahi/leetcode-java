package asadolahi.hosein.stack.q5;

import java.util.Stack;

class MinStack {
    private final Stack<Integer> stack;
    private int min;

    public MinStack() {
        stack = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int val) {
        if (val <= min) {
            stack.push(min);
            min = val;
        }
        stack.push(val);
    }
    public void pop() {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            if (temp > min) {
                min = stack.pop();
            }
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}