class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        // Creating a person using the parameterized constructor
        Person person1 = new Person("Alice", 30);
        System.out.println("Person 1 Details:");
        person1.display();

        System.out.println();

        // Creating a new person by cloning person1 using the copy constructor
        Person person2 = new Person(person1);
        System.out.println("Person 2 (Cloned from Person 1) Details:");
        person2.display();

        System.out.println();

        // Modifying the cloned person's details
        person2.setName("Bob");
        person2.setAge(25);
        System.out.println("Person 2 Details (After Modification):");
        person2.display();

        // Display person1 again to show it is unaffected
        System.out.println("\nPerson 1 Details (Unchanged):");
        person1.display();
    }
}
