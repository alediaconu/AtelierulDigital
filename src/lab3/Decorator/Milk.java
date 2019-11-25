package lab3.Decorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage){
        super("Milk", 2, beverage);
    }
}
