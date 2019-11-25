package lab3.Vistor;

public class Main {
    public static void main(String[] args) {
        Element e1 = new Book(10, 200);
        Element e2 = new Book(20,350);
        Element e3 = new Book(15,100);

        Element v1 = (Element) new Video(20, 123);
        Element v2 = (Element) new Video(15, 100);

        Element[] elements =  new Element[]{e1,e2,e3,v1,v2};
        Visitor visitor = new Visitor();
        for(Element e:elements){
            e.accept(visitor);

        }
        System.out.println("Price= "+visitor.getTotalPrice());
        System.out.println("Time= "+visitor.getTotalTime());

    }
}
