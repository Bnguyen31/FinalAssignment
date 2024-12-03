import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.addAll(Arrays.asList(5, -5, 67, -45, 67, 9, 0, -42, 56, -7));

        SplitStack.splitStack(stack1);
        System.out.println(stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.addAll(Arrays.asList(1, -2, -3, 4, -5, 6, -7, 8, 9));

        SplitStack.splitStack(stack2);
        System.out.println(stack2);
    }
}
