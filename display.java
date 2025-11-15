public class OverloadExample {
    void display() {
        System.out.println("No parameters");
    }

    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(String b) {
        System.out.println("String: " + b);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.display();
        obj.display(10);
        obj.display("Hello");
    }
}