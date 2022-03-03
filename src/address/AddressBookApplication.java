/**
 * @author Esad Hasanovic
 **/
package address;

import address.data.addressBook;
import address.data.addressEntry;

import java.util.Scanner;

public class AddressBookApplication {
    /**
     * @param args inputs
     */
    public static void main(String[] args) {
        // user input
        Scanner UInput = new Scanner(System.in);
        // instance of address book and menu
        addressBook ab = new addressBook();
        Menu myMenu = new Menu();

        while (true) {
            // Displays menu
            System.out.println(myMenu.displayMenu());
            // asks user to make a selection
            System.out.println("Please make a selection: ");
            // String input for menu selection
            String choice = UInput.nextLine();

            switch (choice) {
                //load from file
                case "a":
                    // addressEntry object
                    addressEntry entry;

                    // ask user to input entrys to add user
                    entry = new addressEntry(myMenu.prompt_FirstName(), myMenu.prompt_LastName(), myMenu.prompt_Street(),
                            myMenu.prompt_City(), myMenu.prompt_State(), myMenu.prompt_Zip(), myMenu.prompt_Telephone(), myMenu.prompt_Email());

                    // use info to make new ab entry
                    ab.add(entry);
                    System.out.println("\nSuccessfully added into address book.\n");
                    break;


                case "b":
                    // Prompt for last name to remove user
                    System.out.println("Last name of person to remove: ");

                    // Input last name
                    String delName = UInput.nextLine();
                    // remove entry
                    ab.remove(delName);
                    break;


                case "c":
                    // ask to enter last name to search for entry
                    System.out.println("Search last name: ");
                    // Input last name
                    String findLastName = UInput.nextLine();
                    //search for entry
                    ab.find(findLastName);
                    break;


                case "d":
                    // Check for file
                    boolean FileNA = true;
                    while (FileNA == true) {
                        // Enter file name
                        System.out.println("Enter File name: ");
                        try {
                            // Input file name
                            String fileName = UInput.nextLine();
                            // Read file
                            ab.readFromFile(fileName, ab);
                            // File found exit loop
                            FileNA = false;

                        } catch (Exception IOException) {
                            // prompts the file not found
                            System.out.println("File not found");
                        }
                    }
                    break;


                case "e":
                    // Display all entries
                    ab.list();
                    break;


                case "f":
                    // Quit
                    System.out.println("Exiting program.");
                    System.exit(0);
                    break;


                default:
                    // if not a case, print inccorect input
                    System.out.println("Incorrect input");

            }
        }
    }
}

