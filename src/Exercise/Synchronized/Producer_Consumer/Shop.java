package Exercise.Synchronized.Producer_Consumer;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<String> data = new ArrayList<String>();
    public void produce() {
        synchronized (data) {
            if (data.size() > 0) {
                System.out.println("可以卖面包了");
                data.notify();// 生产者加锁，消费者等待，此句为了唤醒正在等待该资源的线程（消费者）
                try {
                    data.wait();//自己（生产者）释放锁
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            String a = "面包" + System.currentTimeMillis();
            data.add(a);
            System.out.println("生成了：" + a + ",找人来吃，现在面包个数为：" + data.size());
//            data.notify();
//            try {
//                data.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
    public void sale() {
        synchronized (data) {
            if (data.size() == 0) {
                try {
                    System.out.println("没面包了该通知做面包了");
                    data.notify();
                    data.wait();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            String s = data.get(0);
            data.remove(0);
            System.out.println("吃掉了面包" + s);
            data.notify();
        }
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread productor = new Thread(new Productor(shop));
        Thread customer = new Thread(new Customer(shop));
        productor.start();
        customer.start();

    }


}
