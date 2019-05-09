import java.util.Scanner;
import java.io.File;
class main {
    public static void main(String[] args) {
        // Create the FamilyTree object
        ParentsManager myParentsManager = new ParentsManager();
        // Create a new Parent object for James
        Parent brother1 = new Parent();
        // Set the fields
        brother1.name = "Juan";
        System.out.println(brother1.name);
        System.out.println("Enter your Phone Number: ");
        Scanner scanner = new Scanner(System.in);
        brother1.phoneNumber = scanner.nextLine();
        System.out.println("Enter your Email:");
        Scanner scanner1 = new Scanner(System.in);
        brother1.email = scanner1.nextLine();
        System.out.println("Enter your address: ");
        Scanner scanner2 = new Scanner(System.in);
        brother1.address= scanner2.nextLine();
        System.out.println("Enter your relationship: ");
        Scanner scanner3 = new Scanner(System.in);
        brother1.typeparent= scanner3.nextLine();
        System.out.println("Enter your date of birthday: ");
        Scanner scanner4 = new Scanner(System.in);
        brother1.dateofbirthday= scanner4.nextLine();
        // Add Juan Parent to the ParentsManager
        myParentsManager.addParent(brother1);
        // Create a new Parent object for Carla
        Parent sister1 = new Parent();
        // Set the fields
        sister1.name = "Carla";
        sister1.phoneNumber = "0612223333";
        sister1.email= "carla.s@gmail.com";
        sister1.address= "Ayacucho#1611";
        sister1.typeparent = "Sister";
        sister1.dateofbirthday= "August 4";
        // Add Carla Parent to the ParentsManager
        myParentsManager.addParent(sister1);

        // Now let's try to search of a contact and display their phone number
        Parent result = myParentsManager.searchParent("Juan");
        System.out.println("Name of Parent: " + result.name);
        System.out.println("Phone Number:"+result.phoneNumber);
        System.out.println("Email: "+result.email);
        System.out.println("Address: "+result.address);
        System.out.println("Type Parent: "+result.typeparent);
        System.out.println("Date of Birth: "+result.dateofbirthday);

    }
}




