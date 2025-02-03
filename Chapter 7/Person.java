public class Person {
    private String name;
    private int age;
    private String country;

    // Constructor
    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    // toString method to display person details
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nCountry: " + country;
    }

    public static void main(String[] args) {
        // Create a new Person object
        Person person = new Person("Chisom James", 30, "Nigeria");

        // Display person details
        System.out.println("Person Details:");
        System.out.println(person.toString());

        // Modify person details using setter methods
        person.setName("Jane");
        person.setAge(25);
        person.setCountry("Canada");

        // Display updated person details
        System.out.println("\nUpdated Person Details:");
        System.out.println(person.toString());
    }
}