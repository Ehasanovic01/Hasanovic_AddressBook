package address.data;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class addressEntryTest {

    @Test
    void testToString() {
        addressEntry entry1;
        entry1 = new addressEntry("Esad", "Hasanovic", "2nd A St", "Hayward", "CA",
                94540, "9257059534", "Hasanovic27@gmail.com");

        assertEquals(entry1.toString(), entry1.toString());
    }

    @Test
    void setFirstName() {
        addressEntry entry1 = new addressEntry();
        entry1.setFirstName("Esad");
        assertEquals("Esad", entry1.getFirstName());
    }

    @Test
    void setLastName() {
        addressEntry entry1 = new addressEntry();
        entry1.setLastName("Hasanovic");
        assertEquals("Hasanovic", entry1.getLastName());
    }

    @Test
    void setStreet() {
        addressEntry entry1 = new addressEntry();
        entry1.setStreet("2nd A St");
        assertEquals("22nd B St", entry1.getStreet());
    }

    @Test
    void setCity() {
        addressEntry entry1 = new addressEntry();
        entry1.setCity("Hayward");
        assertEquals("Walnut Creek", entry1.getCity());
    }

    @Test
    void setState() {
        addressEntry entry1 = new addressEntry();
        entry1.setState("CA");
        assertEquals("CA", entry1.getState());
    }

    @Test
    void setZip() {
        addressEntry entry1 = new addressEntry();
        entry1.setZip(94540);
        assertEquals(94540, entry1.getZip());
    }

    @Test
    void setPhone() {
        addressEntry entry1 = new addressEntry();
        entry1.setPhone("9257059534");
        assertEquals("9257059534", entry1.getPhone());
    }

    @Test
    void setEmail() {
        addressEntry entry1 = new addressEntry();
        entry1.setEmail("ehasanovic@gmail.com@gmail.com");
        assertEquals("ehasanovic@gmail.com@gmail.com", entry1.getEmail());
    }
}