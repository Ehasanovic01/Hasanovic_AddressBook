/**
 * Menu class outputs info based on name, address ,ect
 **/

package address;

import java.util.Scanner;

public class Menu {
    // user input
    Scanner Input = new Scanner(System.in);

    public String displayMenu() {
        /**
         * @return displays the menu options
         **/
        System.out.println("Select your choice");
        System.out.println("a) Add Entry");
        System.out.println("b) Remove Entry");
        System.out.println("c) Find Entry");
        System.out.println("d) Load Entry File ");
        System.out.println("e) List");
        System.out.println("f) Quit");
        return "";
    }


    public String prompt_FirstName() {
        /**
         * @return users first name
         **/
        System.out.println("First Name: ");
        return Input.nextLine();
    }


    public String prompt_LastName() {
        /**
         * @return users last name
         **/
        System.out.println("Last Name: ");
        return Input.nextLine();
    }


    public String prompt_Street() {
        /**
         * @return users street address
         **/
        System.out.println("Street: ");
        return Input.nextLine();
    }

    public String prompt_City() {
        /**
         * @return users city
         **/
        System.out.println("City: ");
        return Input.nextLine();
    }


    public String prompt_State() {
        /**
         * @return users state
         **/
        System.out.println("State: ");
        return Input.nextLine();
    }


    public Integer prompt_Zip() {
        /**
         * @return users zip code
         **/
        System.out.println("Zip: ");
        return Integer.parseInt(Input.nextLine());
    }


    public String prompt_Telephone() {
        /**
         * @return users telephone number
         **/
        System.out.println("Telephone: ");
        return Input.nextLine();
    }

    public String prompt_Email() {
        /**
         * @return users email address
         **/
        System.out.println("Email: ");
        return Input.nextLine();
    }

}
