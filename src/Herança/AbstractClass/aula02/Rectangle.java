package Herança.AbstractClass.aula02;

public class Rectangle extends Shape {
    Double width;
    Double height;

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Double area() {
        return this.height * this.width;
    }
}
