public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("-----");
        Main main = new Main();
        main.add();
    }

    public void add() {
        try {
            System.out.println("abc");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}