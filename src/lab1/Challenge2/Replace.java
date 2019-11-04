package lab1.Challenge2;

public class Replace {

    void fooBarQix(){
        int i=1;
        for(i =1 ;i <= 100;i++){
            if(i%3==0){
                System.out.println("Foo");}
            else {
                if (i%5==0){
                    System.out.println("Bar");}
                else {
                    if (i%7==0){
                        System.out.println("Qix");}
                    else{
                        System.out.println(i);
                    }

                    };

                }
            }

        }


    public static void main (String args []){
        System.out.println("Atelierul Digital 2019");
        Replace a= new Replace ();
        a.fooBarQix();}
}
