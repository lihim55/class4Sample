public class Cat extends Animal{

    //Constructor
    public Cat (String type, String color) {
        super("Cat",color,type);
    }

    //behaviour
    public void makeSound() {
        System.out.println("Meow!");
    }
}

