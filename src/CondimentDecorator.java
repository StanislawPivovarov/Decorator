public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();

    @Override
    public Size setSize(Size size) {
        return beverage.getSize();
    }
}
