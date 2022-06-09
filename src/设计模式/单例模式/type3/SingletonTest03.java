package 设计模式.单例模式.type3;

public class SingletonTest03 {

    public static void main(String[] args) {
        //解决线程同步，但是效率太低
    }
}

class Singleton{

    private static Singleton instance;

    private Singleton() {

    }

    //懒汉式，当使用时再创建
    public synchronized static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }


}