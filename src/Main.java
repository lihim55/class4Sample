import java.util.ArrayList;
import java.util.List;

public class Main {
       public static void main(String[] args) {
           //Dog myDog = new Dog("Labrador", "White");
           //Labrador myDog = new Labrador("Black");
           //Chiwawa myDog = new Chiwawa("White");
           //Dog myDog = new Chiwawa("White");
           Animal myAnimal1 = new Labrador("Black");
           Animal myAnimal2 = new Cat("Persian","White");
           List<Animal> myList = new ArrayList<>();
           myList.add(myAnimal1);
           myList.add(myAnimal2);

           for (Animal myAnimal : myList) {
               System.out.println("My "+ myAnimal.Kind +" is a " + myAnimal.Type + " He is " + myAnimal.Color);
               myAnimal.makeSound();
           }


       }
    }