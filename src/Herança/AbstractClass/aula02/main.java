package Herança.AbstractClass.aula02;

public class main {
    public static void main(String[] args) {
       Rectangle rectangle = new Rectangle(Color.BLUE, 50.0,2.0);
        System.out.println(rectangle.area());
        Circle circle = new Circle(Color.BLACK, 2.0);
        System.out.println(circle.area());
    }
}
