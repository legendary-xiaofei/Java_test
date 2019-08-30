package Exercise.Synchronized;


public class Printf_Number {

    public static void main(String[] args) {
        final Printf_Number printf_number = new Printf_Number();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    synchronized ( printf_number ) {

                        System.out.println(1);
                        printf_number.notify();
                        try {
                            printf_number.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    synchronized ( printf_number ) {

                        System.out.println(2);
                        printf_number.notify();
                        try {
                            printf_number.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        t1.start();
        t2.start();
    }
}
