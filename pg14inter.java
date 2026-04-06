import java.util.Scanner;

// Interface
interface Shape {
    double area();  // abstract method (by default)
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing area method
    public double area() {
        return length * width;
    }
}

// Circle class implementing Shape
class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing area method
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Main class (User Interface)
public class pg14inter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Shape:");
        System.out.println("1. Rectangle");
        System.out.println("2. Circle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        Shape shape; // interface reference

        switch (choice) {
            case 1:
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();

                shape = new Rectangle(length, width);
                System.out.println("Area of Rectangle: " + shape.area());
                break;

            case 2:
                System.out.print("Enter radius: ");
                double radius = sc.nextDouble();

                shape = new Circle(radius);
                System.out.println("Area of Circle: " + shape.area());
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
