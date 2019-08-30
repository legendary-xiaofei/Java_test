package Exercise.Synchronized.Producer_Consumer;

class Productor implements Runnable{
    Shop shop;

    public Productor(Shop shop) {
        super();
        this.shop = shop;
    }

    @Override
    public void run() {
        while(true){
            shop.produce();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        // TODO Auto-generated method stub

    }
}

