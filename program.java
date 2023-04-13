import java.util.ArrayList;
import java.util.List;


public class program {
    public static void main(String[] args) {

        Toy toy1 = new Toy(0, "Doll", 25);
        Toy toy2 = new Toy(1, "Car", 40);
        Toy toy3 = new Toy(2, "Robot", 3);
        Toy toy4 = new Toy(3, "TeddyBear", 60);
        Toy toy5 = new Toy(4, "Train", 65);
        Toy toy6 = new Toy(5, "Simple Dimple", 20);
        Toy toy7 = new Toy(6, "Spinner", 10);
        Toy toy8 = new Toy(7, "Bunny", 45);
        Toy toy9 = new Toy(8, "Lego", 25);
        Toy toy10 = new Toy(9, "DollsHouse", 65);

        List<Toy> toys = new ArrayList<Toy>();
        toys.add(toy10);
        toys.add(toy9);
        toys.add(toy8);
        toys.add(toy7);
        toys.add(toy6);
        toys.add(toy5);
        toys.add(toy4);
        toys.add(toy3);
        toys.add(toy2);
        toys.add(toy1);

        ToyStore toyStore = new ToyStore(toys);
        toyStore.saveToy();
        toyStore.saveToy();
        toyStore.saveToy();
        toyStore.saveToy();
        toyStore.saveToy();
        toyStore.saveToy();
        toyStore.saveToy();
        toyStore.saveToy();
        toyStore.saveToy();
        toyStore.saveToy();
        System.out.println("Файл записан");

    }
    
    
}