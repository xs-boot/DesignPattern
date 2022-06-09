package 设计模式.单例模式.type1;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);//true
    }
}

class Singleton{
    //1:构造器私有化
    private Singleton() {

    }

    //2:在本类内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3:提供一个公有的静态方法，来获取实例的方法
    public static Singleton getInstance() {
        return instance;
    }
}