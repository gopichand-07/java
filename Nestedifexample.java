public class Nestedifexample {
public static void main(String[] args) {
    int marks = 85;
    if (marks >= 50) {
        System.out.println("You are eligible to sit for the exam.");    
        if (marks >= 90) {
            System.out.println("Grade:A+");
        } else if (marks >= 75) {
            System.out.println("Grade:A");
        }
    } else {
        System.out.println("You are not eligible to sit for the exam.");
        System.out.println("Grade:B");
    }
}
}
