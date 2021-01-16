package day9.Task2;

public class Rectangle extends Figure {
    double width, length;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width=width;
        this.length=height;

    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2*(width+length);
    }
}
