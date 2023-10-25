package BaiTap.TaoThreadDonGian;

import java.util.Random;

public class NumberGenerator implements Runnable {
    private int count = 0;
    private final int MAX_COUNT = 10;
    private final int DELAY = 500;

    @Override
    public void run() {
        Random rand = new Random();
        while (count < MAX_COUNT) {
            System.out.println("Thread " + Thread.currentThread().getName() + " : " + rand.nextInt(100));
            System.out.println("Thread " + Thread.currentThread().getName() + " hascode : " + this.hashCode());
            count++;
            try {
                Thread.sleep(DELAY);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
