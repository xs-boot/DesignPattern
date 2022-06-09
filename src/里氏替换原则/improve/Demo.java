package 里氏替换原则.improve;

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.fun1(1, 2));
        System.out.println(a.fun2(1, 2));

        B b = new B();
        System.out.println(b.fun1(1, 2));
        System.out.println(b.fun2(1, 2));
    }

}


class Base{}

class A extends Base{
    public int fun1(int a, int b) {
        return a - b;
    }

    public int fun2(int a, int b) {
        return fun1(a, b) + 1;
    }
}

class B extends Base{
    private A a = new A();

    public int fun1(int a, int b) {
        return a + b;
    }

    public int fun2(int a, int b) {
        return this.a.fun2(a, b);
    }
}