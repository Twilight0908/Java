package threading;

public class Demo {
    public static void main(String[] args) {
        Runnable mt1 = new MyTask("A", 50);
        Runnable mt2 = new MyTask("B==", 50);

        Thread thread1 = new Thread(mt1);
        Thread thread2 = new Thread(mt2);

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("------------");

        Thread mt3 = new MyThread("C--", 50);
        Thread mt4 = new MyThread("D++", 50);

        mt3.start();
        mt4.start();
    }
}

class MyTask implements Runnable {
    private String name;
    private int time;

    public MyTask(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.time; i++) {
            System.out.println(this.name);
        }
    }
}

class MyThread extends Thread {
    private String name;
    private int time;

    public MyThread(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.time; i++) {
            System.out.println(this.name);
        }
    }
}
