package lr5;

public class Example4 {

        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                Thread thread = new Thread(new DisplayNumber(i));
                thread.start();
            }
        }
    }

    class DisplayNumber implements Runnable {
        private int number;

        public DisplayNumber(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            System.out.println("Номер резьбы：" + number);
        }
    }


