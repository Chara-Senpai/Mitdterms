
class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    
    public String getBreed() {
        return breed;
    }

    
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void printDogInfo() {
        System.out.println("Dog's Name: " + name + ", Breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Lock", "Chiwawa");
        Dog dog2 = new Dog("Flop", "Bulldog");

    
        System.out.println("Initial details of the dogs:");
        dog1.printDogInfo();
        dog2.printDogInfo();

        dog1.setName("Key");
        dog1.setBreed("Golden Retriever");
        
        dog2.setName("Flip");
        dog2.setBreed("Pug");

    
        System.out.println("\nUpdated details of the dogs:");
        dog1.printDogInfo();
        dog2.printDogInfo();
    }
}
