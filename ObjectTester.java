public class ObjectTester {
    public static void main(String[] args) {

        // make a Cat object - default constructor
        Cat cat1 = new Cat();
        System.out.println(cat1);

        // make a Cat object - non-default constructor
        Cat cat2 = new Cat("Socks", 2, "Siamese");
        System.out.println(cat2);

        // set the name properly
        cat2.setName("Milo");
        System.out.println(cat2);

        // only print cat's name
        System.out.println(cat2.getName());
    }
}
