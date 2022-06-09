package 依赖倒置;

public class DependenceInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());

    }
}

class Person{
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}


class Email{
    public String getInfo() {
        return "电子邮件";
    }
}
