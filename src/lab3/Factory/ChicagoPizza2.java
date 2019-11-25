package lab3.Factory;

public class ChicagoPizza2 extends Pizza {
    public ChicagoPizza2(String name){
        super(name);

    }
    @Override
    public void prepare(){
        System.out.println("prepare ch2");
        setDough("dcfd");
        setSauce("sedf");

    }
}
