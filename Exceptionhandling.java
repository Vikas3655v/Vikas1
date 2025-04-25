
abstract class Shape {
    abstract void draw();
    abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    void draw() {
        System.out.println("Drawing a Circle");
    }
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class ExceptionHandlingExample {
    public static void main(String[] args) {
      
        Shape rect = new Rectangle(5.0, 3.0);
        rect.draw();
        System.out.println("Area of Rectangle: " + rect.calculateArea());

        Shape circ = new Circle(4.0);
        circ.draw();
        System.out.println("Area of Circle: " + circ.calculateArea());

        
        try {
            int num1 = 10, num2 = 0;
            System.out.println("Result: " + (num1 / num2)); 
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}

