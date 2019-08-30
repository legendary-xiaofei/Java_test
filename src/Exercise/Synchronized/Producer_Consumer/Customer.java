package Exercise.Synchronized.Producer_Consumer;

class Customer implements Runnable{
    Shop shop;

    public Customer(Shop shop) {
        super();
        this.shop = shop;
    }
    @Override
    public void run() {

        while(true){
            shop.sale();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }

}
