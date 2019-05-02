package contactManager;

public class Main {
    public static void main(String[] args){
        ContactsManager myContactManager = new ContactsManager();
        Contact aylin = new Contact("Aylin Daniela",78314536);
        Contact diego = new Contact("Diego Fernando",78677890);
        Contact cesar = new Contact("Cesar",2349567);
        myContactManager.addContact(aylin);
        myContactManager.addContact(diego);
        myContactManager.addContact(cesar);
        System.out.println(myContactManager.searchContact("Aylin Daniela").phoneNumber);


    }
}
