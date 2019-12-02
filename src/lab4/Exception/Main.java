package lab4.Exception;

public class Main {
    public void iterate (String [] strings) throws MyException{
        for(String s: strings){
            if(s == null){
                throw new MyException("null element in array");
            }
        }
    }
    public static void catchwithFinally(){
        String [] strings = new String[3];
        strings[1] = "element1";
        strings[2] = "element2";
        strings[3] = "element3";
        Main m = new Main();

        try{
            m.iterate(strings);
            System.out.println("after exception in try");

        }catch (Exception e){
            System.out.println(e);
            strings[1] = "ceva";
            System.out.println(strings[1]);
        }finally {
            System.out.println("Finally was executed");
        }
    }
    public void methodThatThrowsException() throws MyException{
        Main m = new Main();
        m.iterate(new String[]{"ell",null,"ell2"});
    }
    public void methodThatThrowsRunException(String s) throws RunException{
        if (s.equals("throw")){
            throw new RunException("Run");
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        try {
            m.methodThatThrowsException();
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            m.methodThatThrowsException();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("after RunTimeException");
    }
}
