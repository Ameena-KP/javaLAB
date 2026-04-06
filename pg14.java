//abstract class
abstract class Shape {
  //abstract method
    abstract double area();
}

// Rectangle class inheriting Shape
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing area method
    double area() {
        return length * width;
    }
}

// Circle class inheriting Shape
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing area method
    double area() {
        return Math.PI * radius * radius;
    }
}

// Main class
public class pg14 {
    public static void main(String[] args) {
        // Creating objects
        Rectangle rect = new Rectangle(5, 3);
        Circle circ = new Circle(4);

        // Displaying areas
        System.out.println("Area of Rectangle: " + rect.area());
        System.out.println("Area of Circle: " + circ.area());
    }
}
