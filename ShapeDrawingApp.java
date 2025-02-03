// Abstract class Shape
abstract class Shape {
    abstract void draw();
}

// Circle class that extends Shape
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle class that extends Shape
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class ShapeDrawingApp {
    public static void main(String[] args) {
        // Create Shape objects
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Call draw() method on each object
        circle.draw();
        rectangle.draw();
    }
}
