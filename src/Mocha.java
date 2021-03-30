public class Mocha extends CondimentDecorator {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "Mocha ";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == Size.Tall){
            cost += 0.10;
        } else if(beverage.getSize() == Size.Grande){
            cost += 0.15;
        } else if(beverage.getSize() == Size.Venti){
            cost += 0.20;
        }
        return 0.20 + beverage.cost();
    }
}
