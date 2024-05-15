import java.util.Scanner;

public class Produce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Choose the type of furniture (1 for Modern, 2 for Victorian, 0 to exit):");
            int choice = scanner.nextInt();
            
            FurnitureFactory furnitureFactory;
            if (choice == 1) {
                furnitureFactory = new ModernFurnitureFactory();
            } else if (choice == 2) {
                furnitureFactory = new VictorianFurnitureFactory();
            } else if (choice == 0) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 1 for Modern, 2 for Victorian, or 0 to exit.");
                continue;
            }

            Chair chair = furnitureFactory.createChair();
            Sofa sofa = furnitureFactory.createSofa();
            CoffeeTable coffeeTable = furnitureFactory.createCoffeeTable();

            chair.sitOn();
            sofa.lieOn();
            coffeeTable.putCoffee();
        }
        
        scanner.close();
    }
}
