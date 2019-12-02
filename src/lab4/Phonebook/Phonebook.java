package lab4.Phonebook;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Phonebook {

    private Scanner s = null;
    private Contact[] contacts = new Contact[10];
    private int count = 0;

    public Phonebook(String filePath){
        try{
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            Scanner s = new Scanner(br);
            this.s = s;

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void importContacts(){
        String name;
        Double number;
        while(s.hasNext()){
            name = s.next();
            if (s.hasNextDouble()){
                number = s.nextDouble();
                contacts[count] = new Contact(name, number);
                count ++;
            }
        }
    }
    public void displayContacts(){
        for(int i=0; i<count; i++){
            System.out.println(contacts[i]);
        }
    }
    public void showNumbers(String name){
        for(int i=0; i<count; i++){
            if(contacts[i].getName().equals(name)){
                System.out.print("Phonenumber: "+contacts[i].getPhoneNumber());
            }
        }

    }
}
