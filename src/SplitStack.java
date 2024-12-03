import java.util.*;

public class SplitStack {
    public static void splitStack(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        for (int num : queue) {
            if (num < 0) {
                stack.push(num);
            }
        }
        for (int num : queue) {
            if (num >= 0) {
                stack.push(num);
            }
        }
    }
}
