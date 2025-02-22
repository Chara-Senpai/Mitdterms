class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Joe", 35, "111 Granada St.");
        Person person2 = new Person("Bob", 50, "456 Kalayaan Rd.");
        Person person3 = new Person("Tristan", 18, "578 Dalaga Ave.");
        Person person4 = new Person("Ed", 27, "101 Katipunan Rd.");
        Person person5 = new Person("Eve", 90, "202 Villadolid Ln.");

        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();
        person4.printPersonInfo();
        person5.printPersonInfo();
    }
}
