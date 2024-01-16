public abstract class Animal implements IAnimal{

    public String Type;
    public String Color;
    public String Kind;

    public Animal(String kind,String color, String type) {
        this.Color = color;
        this.Kind = kind;
        this.Type = type;
    }

    public abstract void makeSound();

}
