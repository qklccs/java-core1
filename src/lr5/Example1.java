package lr5;
import java.util.Date;
public class Example1 {
        public static void main(String[] args) {
            Thread thread1 = new Thread(new DisplayInfo(), "Поток 1");
            Thread thread2 = new Thread(new DisplayInfo(), "Поток 2");

            thread1.start();
            thread2.start();
        }
    }

    class DisplayInfo implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Имя потока:" + Thread.currentThread().getName() + ", Текущее время:" + new Date());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }


}
