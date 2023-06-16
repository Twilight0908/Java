package arrayList.list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> integerMyList = new MyList<>();

        integerMyList.add(1);
        integerMyList.add(2);
        integerMyList.add(3);
        integerMyList.add(4);
        integerMyList.add(5);

        for (int i = 0; i < integerMyList.getSize(); i++) {
            System.out.println(integerMyList.get(i));
        }
    }
}
