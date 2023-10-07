package com.taliun;

class Animal {
    private String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void makeSound() {
        System.out.println(name + " makes a generic animal sound.");
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    private String breed;
    
    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    
    @Override
    public void makeSound() {
        System.out.println(getName() + " (a " + breed + " dog) barks.");
    }
    
    public void fetch() {
        System.out.println(getName() + " (a " + breed + " dog) is fetching a ball.");
    }
    
    public void bark() {
        System.out.println(getName() + " (a " + breed + " dog) barks loudly.");
    }
    
    // Getter method for the name field
    public String getName() {
        return super.getName();
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog("Buddy", "Golden Retriever");
        
        myAnimal.makeSound(); // Calls the overridden makeSound() method in Dog
        myAnimal.eat();       // Calls the eat() method in Animal
        
        // Uncomment the following lines to access dog-specific methods
        // Dog myDog = (Dog) myAnimal; // Casting to Dog
        // myDog.fetch();
        // myDog.bark();
    }
}