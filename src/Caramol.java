
public class Caramol extends AddOnDecorator {

    public Beverage  beverage;

    public Caramol(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public int cost() {
        return this.beverage.cost() + 2;
    }
    
}