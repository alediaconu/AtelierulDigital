package lab3.Decorator;

public class Whip extends   CondimentDecorator{
    public Whip(Beverage beverage){
        super("White whip", 2, beverage);
    }
}
