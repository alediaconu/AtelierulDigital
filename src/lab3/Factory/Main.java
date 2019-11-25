package lab3.Factory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory nyStore = new NYPizzaStore();
        AbstractFactory chicagoStore = new ChicagoPizzaStore();

        nyStore.orderPizza("Margerita");
        System.out.println("");
        chicagoStore.orderPizza("Chicago1");
        chicagoStore.orderPizza("Chicago2");
    }
}
