package lab3.Factory;

public class ChicagoPizza extends Pizza {
    public ChicagoPizza(String pizzaName){
       super(pizzaName);
    }
    @Override
    public void prepare(){
        System.out.println("prepare");
        setDough("sweet chicago");
        setSauce("sweet");
    }
}
