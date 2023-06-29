package threading;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account("A", 16);

        Runnable task1 = new WithDrawTask(account);
        Runnable task2 = new WithDrawTask(account);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}

class Account {
    private String name;
    private int amount;

    public Account(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    synchronized public void withDraw(int a) throws InterruptedException {
        if (this.amount > a) {
            Thread.sleep(1000);

            this.amount = this.amount - a;
            System.out.println(this.amount);
        } else {
            System.out.println("Not Enough Money");
        }
    }
}

class WithDrawTask implements Runnable {
    private Account account;

    public WithDrawTask(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        try {
            this.account.withDraw(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}