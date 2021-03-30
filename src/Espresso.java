public class Espresso extends Beverage {
    public Espresso() {
        description = "Эспрессо";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
