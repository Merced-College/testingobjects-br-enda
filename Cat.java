//Brenda Romero
//9/9/25
//Cat class for my Cat objects

public class Cat {

    // data variables, they describe the Cat objects in the computer
    private String name;
    private int age;
    private String breed;

    // default constructor
    public Cat() {
        this.name = "Garfield";
        this.age = 3;
        this.breed = "Domestic Short Hair";
    }

    // non-default constructor
    public Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // setters - mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // getters - accessors
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getBreed() {
        return breed;
    }

    // toString method
    @Override
    public String toString() {
        return name + ", " + age + ", " + breed;
    }
} // end Cat class
