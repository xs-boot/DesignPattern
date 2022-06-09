package 设计模式.单例模式.type6;

public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
    }
}

//推荐使用
enum Singleton{
    INSTANCE;

    public void sayHello() {
        System.out.println("hello~~~");
    }
}
