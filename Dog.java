// Dog.java
public class Dog {
    private String name;
    private int age;
    private String breed;

    // default constructor
    public Dog() {
        this.name = "Unknown";
        this.age = 0;
        this.breed = "Mixed";
    }

    // parameterized constructor
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // getters/setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) {
        if (age >= 0) this.age = age;
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    // toString
    @Override
    public String toString() {
        return "Dog{name='" + name + "', age=" + age + ", breed='" + breed + "'}";
    }
}
