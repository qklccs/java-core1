package lr5;

public class Example3 {

        public static void main(String[] args) {
            Thread evenThread = new Thread(new PrintEven());
            Thread oddThread = new Thread(new PrintOdd());

            evenThread.start();
            oddThread.start();
        }
    }

    class PrintEven implements Runnable {
        @Override
        public void run() {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("ровный：" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    class PrintOdd implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println("Нечетное число：" + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


