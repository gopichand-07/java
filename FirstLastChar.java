import java.util.Scanner;
public class FirstLastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        if (str.length() > 0) {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            System.out.println("First character: " + first);
            System.out.println("Last character: " + last);
        } else {
            System.out.println("String is empty!");
        }
        sc.close();
    }
}
