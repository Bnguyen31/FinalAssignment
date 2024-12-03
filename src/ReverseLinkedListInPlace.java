import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedListInPlace {

    public static <E> void reverseLinkedListInPlace(LinkedList<E> list) {
        if (list.isEmpty()) return;

        ListIterator<E> forwardIterator = list.listIterator();
        ListIterator<E> backwardIterator = list.listIterator(list.size());

        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            // Move backwardIterator to the previous element
            E front = forwardIterator.next();
            E back = backwardIterator.previous();

            // Swap elements
            forwardIterator.set(back);
            backwardIterator.set(front);
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Before reversing in place: " + linkedList);
        reverseLinkedListInPlace(linkedList);
        System.out.println("After reversing in place: " + linkedList);
    }
}
