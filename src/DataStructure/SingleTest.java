package DataStructure;

public class SingleTest {
    private static SingleTest instance;

    /**
     * 1.懒汉模式：只有调用的时候才会初始化实例
     *
     * 2.DCL：Double Check Lock双重检查加锁模式
     *
     * 3.静态内部类模式：饿汉模式
     *
     * 4.枚举
     *
     * 5.容器模式
     */

    private SingleTest(){
    }

    /**
     * 懒汉模式
     *
     * @return
     */
    public static synchronized SingleTest getInstance(){//不安全
        if (instance==null) {
            instance = new SingleTest();
        }

        return instance;
    }

    /**
     * DCL模式
     */

    public static SingleTest getInstance2(){//双重检查加锁机制
        if (instance==null){

            synchronized (SingleTest.class){
                if (instance==null){

                    instance=new SingleTest();
                }
            }
        }

        return instance;
    }

    /**
     *
     * 3.静态内部类模式:饿汉模式
     */
    public static class InstanceHolder{
        private static SingleTest singleTest=new SingleTest();
    }
    public static SingleTest getInstance3() {//饿汉模式

        return InstanceHolder.singleTest;
    }
}
