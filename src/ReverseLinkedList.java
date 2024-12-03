import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {

    public static <E> LinkedList<E> reverseLinkedList(LinkedList<E> list) {
        LinkedList<E> reversedList = new LinkedList<>();
        ListIterator<E> iterator = list.listIterator();

        // Iterate through the original list
        while (iterator.hasNext()) {
            E element = iterator.next();
            // Add each element at the front of the new list
            reversedList.addFirst(element);
        }
        return reversedList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Original LinkedList: " + linkedList);
        LinkedList<Integer> reversedList = reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + reversedList);
    }
}

