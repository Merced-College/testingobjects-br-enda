// Main.java
public class Main {
    public static void main(String[] args) {

        // A1: Create a Dog with no constructors defined
        Dog d1 = new Dog();

        // A2: Print the object directly
        System.out.println("Printing d1 directly:");
        System.out.println(d1);

        // d2: Uses default constructor
        Dog d2 = new Dog();
        System.out.println("\nd2 after default constructor:");
        System.out.println("name = " + d2.getName() + ", age = " + d2.getAge() + ", breed = " + d2.getBreed());

        // d3: Uses parameterized constructor
        Dog d3 = new Dog("Rex", 4, "Collie");
        System.out.println("\nd3 after parameterized constructor:");
        System.out.println("name = " + d3.getName() + ", age = " + d3.getAge() + ", breed = " + d3.getBreed());

        // Print objects after overriding toString
        System.out.println("\nPrinting objects after overriding toString():");
        System.out.println("d2 = " + d2);
        System.out.println("d3 = " + d3);

        // Mutate via setters (after making fields private)
        System.out.println("\nMutating via setters after making fields private:");
        d3.setAge(6);
        d3.setName("Maxwell");
        d3.setBreed("Border Collie");

        // Show updated values
        System.out.println("d3 age via getter = " + d3.getAge());
        System.out.println("d3 now = " + d3);
    }
}
