import java.util.Scanner;

class string {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

       
        System.out.println("Length: " + s1.length());

      
        System.out.println("Concat: " + s1.concat(s2));

    
        System.out.println("charAt(0): " + s1.charAt(0));

     
        char[] ch = new char[s1.length()];
        s1.getChars(0, s1.length(), ch, 0);
        System.out.println("getChars: " + new String(ch));

      
        System.out.println("compareTo: " + s1.compareTo(s2));

     
        System.out.println("equals: " + s1.equals(s2));

       
        System.out.println("equalsIgnoreCase: " + s1.equalsIgnoreCase(s2));

       
        System.out.println("startsWith \"A\": " + s1.startsWith("A"));

      
        System.out.println("endsWith \"a\": " + s1.endsWith("a"));

    
        System.out.println("indexOf 'a': " + s1.indexOf('a'));

       
        System.out.print("Enter integer as string: ");
        int i = Integer.valueOf(sc.next());

        System.out.print("Enter double as string: ");
        double d = Double.valueOf(sc.next());

        System.out.println("Integer value: " + i);
        System.out.println("Double value: " + d);

        
    }
}


