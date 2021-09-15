import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack<>();
        // stack.push(10);
        // stack.push(20);
        // stack.push(30);
        // System.out.print(stack.peek());
        // stack.pop();
        // System.out.println(stack);
        Queue<String> queue = new LinkedList<String>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        queue.remove();
        queue.remove();
        System.out.println(queue);

    }
}
