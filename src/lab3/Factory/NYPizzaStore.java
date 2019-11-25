package lab3.Factory;

public class NYPizzaStore extends AbstractFactory {
    public Pizza createPizza (String pizzaName){
        Pizza pizza =  new NYPizza(pizzaName);
        System.out.println("Create ijn NY style ");
        return pizza;
    }
}
