package lab4.Phonebook;

public class Main {
    public static void main(String[] args) {
        Phonebook pb = new Phonebook( "src\\lab4\\Phonebook\\Phonebook.txt" );
        pb.importContacts();
        pb.displayContacts();
        pb.showNumbers("2" );
    }
}
