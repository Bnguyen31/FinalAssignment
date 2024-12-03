import java.util.ArrayList;

public class ReverseArrayList {

    public static <E> void reverseArrayListInPlace(ArrayList<E> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            // Swaping the elements at positions i and (size - i - 1)
            E temp = list.get(i);
            list.set(i, list.get(size - i - 1));
            list.set(size - i - 1, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Before reversing: " + arrayList);
        reverseArrayListInPlace(arrayList);
        System.out.println("After reversing: " + arrayList);
    }
}
