public class gradeexample {
    public static void main(String[] args) {
        char grade = (score >= 90) ? 'A' :
                     (score >= 80) ? 'B' :
                     (score >= 70) ? 'C' :
                     (score >= 60) ? 'D' : 'F';
        System.out.println("The grade for score " + score + " is " + grade);
    }
}
