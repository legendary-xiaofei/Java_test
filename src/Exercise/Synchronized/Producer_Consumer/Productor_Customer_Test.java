package Exercise.Synchronized.Producer_Consumer;

import java.util.ArrayList;
import java.util.List;

public class Productor_Customer_Test {
    public final List<String> list=new ArrayList<>();


        private void productor() {
            synchronized ( list ) {
                if (list.size() > 0) {
                    System.out.println("库房有面包，可以来取！");
                    list.notify();
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    list.add("面包" + System.currentTimeMillis());
                    System.out.println("生产了" + list.get(list.size() - 1));
                    list.notify();
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }

        private void customer() throws InterruptedException {
            synchronized(list){
                if (list.size()>0){
                    System.out.println("啃"+list.remove(0));
                    list.notify();
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (list.size()<=0)
                System.out.println("没有面包啃了");

                list.notify();
                list.wait();


            }

        }

    public static void main(String[] args) {

            Productor_Customer_Test test=new Productor_Customer_Test();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        test.customer();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    test.productor();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }
        }).start();
    }
}


