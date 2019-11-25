package lab3.Factory;

public class NYPizza extends Pizza{

        public NYPizza(String pizzaName){
            super(pizzaName);
        }
        @Override
        public void prepare(){
            System.out.println("prepare NYPizza");
            setDough("crispy");
            setSauce("sweet");
        }

}
