package 设计模式.单例模式.type4;

public class SingletonTest04 {
    public static void main(String[] args) {

    }
}

class Singleton{

    private static volatile Singleton instance;

    private Singleton() {

    }


    //加入双重检查代码,同时解决线程安全问题和懒加载问题
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }


}
