package 设计模式.单例模式.type5;

public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton{

    private Singleton() {

    }

    //写一个静态内部类，该类中有一个静态属性singleton
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }


    public synchronized static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }


}
