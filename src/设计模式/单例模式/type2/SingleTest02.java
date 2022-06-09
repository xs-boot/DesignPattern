package 设计模式.单例模式.type2;

public class SingleTest02 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        //多线程环境下会出现创造多个实例的可能
        System.out.println(instance1 == instance2);//true
    }
}

class Singleton{
    private static Singleton instance;

    private Singleton() {

    }

    //懒汉式，当使用时再创建
    public static Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
