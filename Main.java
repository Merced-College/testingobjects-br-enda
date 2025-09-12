// Main.java
public class Main {
    public static void main(String[] args) {

        // ----- Dog tests -----
        Dog d1 = new Dog();
        System.out.println("Printing d1 directly before toString override:");
        System.out.println(d1);  // uses toString()

        Dog d2 = new Dog();
        System.out.println("\nd2 after default constructor:");
        System.out.println(d2);

        Dog d3 = new Dog("Rex", 4, "Collie");
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println(d3);

        d3.setAge(5);
        d3.setName("Max");
        d3.setBreed("Border Collie");
        System.out.println("\nAfter setters, d3 = " + d3);

        // ----- Cat tests -----
        Cat c1 = new Cat();
        System.out.println("\nFirst cat (default): " + c1);

        Cat c2 = new Cat("Socks", 2, "Siamese");
        System.out.println("Second cat (parameterized): " + c2);

        c2.setName("Milo");
        System.out.println("Renamed cat: " + c2);
        System.out.println("Cat name only: " + c2.getName());
    }
}
