import java.util.Scanner;

// Class to represent a Complex number
class Complex {
    double real;
    double imaginary;

    // Constructor
    Complex(double r, double i) {
        real = r;
        imaginary = i;
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        return new Complex(this.real + c.real,
                           this.imaginary + c.imaginary);
    }

    // Method to display complex number
    void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class complex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();

        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();

        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();

        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();

        // Creating objects
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        // Adding complex numbers
        Complex result = c1.add(c2);

        // Displaying result
        System.out.print("Sum = ");
        result.display();

       
    }
}

