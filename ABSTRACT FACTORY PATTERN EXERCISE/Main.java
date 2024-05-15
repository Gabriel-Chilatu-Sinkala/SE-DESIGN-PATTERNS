// Client code
public class Main {
    public static void main(String[] args) {
        // Creating modern furniture
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        CoffeeTable modernCoffeeTable = modernFactory.createCoffeeTable();

        // Interacting with modern furniture
        modernChair.sitOn();
        modernSofa.lieOn();
        modernCoffeeTable.putCoffee();

        // Creating victorian furniture
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        CoffeeTable victorianCoffeeTable = victorianFactory.createCoffeeTable();

        // Interacting with victorian furniture
        victorianChair.sitOn();
        victorianSofa.lieOn();
        victorianCoffeeTable.putCoffee();
    }
}