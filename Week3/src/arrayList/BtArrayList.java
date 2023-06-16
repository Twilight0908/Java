package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BtArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        System.out.println(arrayList);

        ListIterator<Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
        System.out.println(listIterator.previous());

        LinkedList<String> linkedList = new LinkedList<>();

        List<Double> list = new ArrayList<>();
        List<Integer> integerList = new LinkedList<>();
    }
}
