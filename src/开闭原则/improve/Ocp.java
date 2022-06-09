package 开闭原则.improve;

public class Ocp {
    public static void main(String[] args) {
        //使用看看存在的问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}

//这是一个用于绘图的类 [使用方]
class GraphicEditor {
    //接收 Shape 对象，然后根据 type，来绘制不同的图形
    public void drawShape(Shape s) {
        s.draw();
    }
}

//Shape 类，基类
abstract class Shape {
    int m_type;
    public abstract void draw();
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("画四边形");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}

//新增画三角形
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("画三角形");
    }
}

