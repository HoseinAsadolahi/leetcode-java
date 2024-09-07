package asadolahi.hosein.stack.q1;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for (String op : operations) {
            switch (op) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    stack.push(stack.peek() + stack.get(stack.size() - 2));
                    break;
                default:
                    stack.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (Object integer : stack.toArray()) {
            sum += (int) integer;
        }
        return sum;
    }
}
