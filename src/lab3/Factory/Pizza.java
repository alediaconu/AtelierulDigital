package lab3.Factory;

public abstract class Pizza {
    private String name;
    public String dough;
    public String sauce;

    public Pizza(String name){
        this.name = name;

    }
    public void box(){
        System.out.println("box");
    }
    public void cut(){
        System.out.println("cut");
    }
    public void bake () {
        System.out.println("cut");
    }

public void setDough(String Dough){
        this.dough = dough;
}
public void setSauce(String Sauce){
        this.sauce =  sauce;
}
public abstract void prepare();


}
