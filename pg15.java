import java.util.Scanner;

// Student class
class Student {
    String name;
    int academicScore;

    void getStudentDetails(String studentName, int marks) {
        name = studentName;
        academicScore = marks;
    }
}

// Sports interface
interface Sports {
    void getSportsScore(int score);
}

// Result class
class Result extends Student implements Sports {
    int sportsScore;

    // Implementing interface method
    public void getSportsScore(int score) {
        sportsScore = score;
    }

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + sportsScore);
        System.out.println("Total Score: " + (academicScore + sportsScore));
    }
}

// Main class
public class pg15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Academic Score: ");
        int a = sc.nextInt();

        System.out.print("Enter Sports Score: ");
        int s = sc.nextInt();

        r.getStudentDetails(studentName, a);
        r.getSportsScore(s);

        System.out.println("\n--- Student Result ---");
        r.display();

       
    }
}
