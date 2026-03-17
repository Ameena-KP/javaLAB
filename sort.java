import java.util.*;

public class sort {

    
    public static void bubbleSort(List<String> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) > 0) {
                
                    String temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        List<String> strings = new ArrayList<>();

        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings.add(sc.nextLine());
        }

        System.out.println("\nMenu:");
        System.out.println("1 -> Built-in Sorting");
        System.out.println("2 -> User-defined Sorting");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Collections.sort(strings);
                System.out.println("\nSorted using Built-in method:");
                break;

            case 2:
                bubbleSort(strings);
                System.out.println("\nSorted using User-defined Bubble Sort:");
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

       
        for (String str : strings) {
            System.out.println(str);
        }

       
    }
}

