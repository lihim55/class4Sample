public class Dog extends Animal{

    //Constructor
    public Dog (String type, String color) {
        super("Dog",color,type);
    }

    //behaviour
    public void makeSound() {
        System.out.println("Woof Woof!");
    }
}
