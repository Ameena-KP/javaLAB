import java.util.Scanner;

class Product {
    int pcod;
    String pname;
    double price;

    void getData(Scanner sc) {
        System.out.print("Enter Product Code: ");
        pcod = sc.nextInt();
        System.out.print("Enter Product Name: ");
        pname = sc.next();
        System.out.print("Enter Product Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println("Product Code: " + pcod);
        System.out.println("Product Name: " + pname);
        System.out.println("Product Price: " + price);
    }
}

public class product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("Enter details for Product 1:");
        p1.getData(sc);

        System.out.println("\nEnter details for Product 2:");
        p2.getData(sc);

        System.out.println("\nEnter details for Product 3:");
        p3.getData(sc);

        Product lowest = p1;

        if (p2.price < lowest.price) {
            lowest = p2;
        }

        if (p3.price < lowest.price) {
            lowest = p3;
        }

        System.out.println("\nProduct with the lowest price:");
        lowest.display();

        
    }
}

