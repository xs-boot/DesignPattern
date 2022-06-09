package 依赖倒置.improve;


public class DependecyInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeiXin());
    }
}

interface IReceiver{
    String getInfo();
}

class Email implements IReceiver{
    public String getInfo() {
        return "电子邮件";
    }
}

class WeiXin implements IReceiver{
    public String getInfo() {
        return "微信消息";
    }
}

class Person{
    public void receive(IReceiver iReceiver) {
        System.out.println(iReceiver.getInfo());
    }
}


/**
 * 完成Person接收消息的功能
 * 方式1分析
 * 1。简单,比较容易想到
 * 2。如果我们获取的对象是微信，短信等等，则新增类，同时Person也要增加相应的接收方法
 * 3。解决思路:引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口IReceiver发生依赖
 * 因为Email,WeiXin等等属于接收的范围，他们各自实现IReceiver接口就ok，这样我们就符合依赖倒转原则
 */



