package thread;

public class TestThread2 implements Runnable {
    public int tong;

    public TestThread2() {
        this.tong = 1000;
    }

    public synchronized void ruttien() throws InterruptedException {
        if (tong >0) {
            Thread.sleep(1000);
            tong = tong -1000;
            System.out.println(tong);
        } else System.out.println("khong con tien");
    }

    @Override
    public void run() {
        try {
            ruttien();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        TestThread2 t = new TestThread2();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
    }
}
