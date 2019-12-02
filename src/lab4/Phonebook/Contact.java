package lab4.Phonebook;

public class Contact {
    private String name;
    private double phoneNumber;
    public Contact (String nume, double phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return name;
    }
    public double getPhoneNumber(){
        return phoneNumber;
    }
    public String toString(){
        return "name: "+ name + "phone number: " + phoneNumber;
    }
}
