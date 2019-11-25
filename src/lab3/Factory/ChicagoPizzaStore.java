package lab3.Factory;

public class ChicagoPizzaStore extends AbstractFactory {
    public Pizza createPizza(String pizzaName){
        Pizza pizza=null;
        if(pizzaName == "Chicago1"){
            pizza = new ChicagoPizza(pizzaName);}
        else{
            if(pizzaName == "Chicago2"){
                pizza = new ChicagoPizza2(pizzaName);
            }

        }


        System.out.println("Chicago2");
        System.out.println("Extra step");
        return pizza;

    }
}
