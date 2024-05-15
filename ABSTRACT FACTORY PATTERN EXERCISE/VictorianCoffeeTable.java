// Concrete product variants
class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void putCoffee() {
        System.out.println("Putting coffee on a victorian coffee table.");
    }
}