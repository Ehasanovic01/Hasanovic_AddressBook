package address;

import address.data.addressEntry;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MenuTest {
    @Test
        //Unit testing for First name
    void prompt_FirstName() {
        addressEntry entry = new addressEntry();
        System.out.print("First Name: ");
        entry.setFirstName("Es2d");
        assertEquals("Esad", entry.getFirstName());
    }

    @Test
        //Unit testing for last name
    void prompt_LastName() {
        addressEntry entry = new addressEntry();
        System.out.print("Last Name: ");
        entry.setLastName("Hasa7ovic");
        assertEquals("Hasanovic", entry.getLastName());
    }

    @Test
        //Unit testing for street
    void prompt_Street() {
        addressEntry entry = new addressEntry();
        System.out.print("Street: ");
        entry.setStreet("$237 A st ");
        assertEquals("237 A ST", entry.getStreet());
    }

    @Test
        //Unit testing for City
    void prompt_City() {
        addressEntry entry = new addressEntry();
        System.out.print("City: ");
        entry.setCity("H3yWard");
        assertEquals("Hayward", entry.getCity());
    }

    @Test
        //Unit testing for State
    void prompt_State() {
        addressEntry entry = new addressEntry();
        System.out.print("State: ");
        entry.setState("Ca1i");
        assertEquals("CA", entry.getState());
    }

    @Test
        //Unit testing for Zip
    void prompt_Zip() {
        addressEntry entry = new addressEntry();
        System.out.print("Zip: ");
        entry.setZip(12345);
        entry.getZip();
    }

    @Test
        //Unit testing for Phone #
    void prompt_Telephone() {
        addressEntry entry = new addressEntry();
        System.out.print("Telephone: ");
        entry.setPhone("925-B23-34v3");
        assertEquals("9257059534", entry.getPhone());
    }

    @Test
        //Unit testing for Email
    void prompt_Email() {
        addressEntry entry = new addressEntry();
        System.out.print("Email: ");
        entry.setEmail("dfg34@sadsa.com");
        assertEquals("ehasanovic@gmail.com", entry.getEmail());
    }
}