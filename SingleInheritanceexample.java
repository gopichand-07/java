public class SingleInheritanceexample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }
}
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}
class Dog extends
    Animal {
        void bark() {
            System.out.println("The dog barks.");
        }
    }
// Output:
// The dog barks.           
// This animal eats food.