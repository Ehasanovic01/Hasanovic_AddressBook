package address.data;

public class addressEntry {
    /**
     * Entry's First name, last name, state, etc.
     **/
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zip;
    private String phone;
    private String email;

    /**
     * Default constructor
     **/
    public addressEntry() {
        firstName = " ";
        lastName = " ";
        street = "";
        city = "";
        state = "";
        zip = 0;
        phone = "";
        email = "";
    }

    /**
     * Other constructor initializes all attributes to a new value
     *
     * @param firstName first name
     * @param lastName  last name
     * @param street    street name
     * @param city      city name
     * @param state     state
     * @param zip       zipcode
     * @param phone     phone number
     * @param email     email
     */
    public addressEntry(String firstName, String lastName, String street, String city, String state, int zip, String phone, String email) {
        // Initializing variables
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    /**
     * Formats strings
     *
     * @return a String with all attributes
     */
    public String toString() {
        return firstName + " " + lastName + "\n" + street +
                "\n" + city + ", " + state + " " + zip + "\n" + email + "\n" + phone + "\n\n";
    }


    /**
     * @param firstName sets first name
     **/
    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    /**
     * @param lastName sets last name
     **/
    public void setLastName(String lastName) {

        this.lastName = lastName;
    }

    /**
     * @param street sets street name
     **/
    public void setStreet(String street) {

        this.street = street;
    }

    /**
     * @param city sets city name
     **/
    public void setCity(String city) {

        this.city = city;
    }

    /**
     * @param state - sets state name
     **/
    public void setState(String state) {

        this.state = state;
    }

    /**
     * @param zip sets zipcode
     **/
    public void setZip(Integer zip) {

        this.zip = zip;
    }

    /**
     * @param phone sets phone number
     **/
    public void setPhone(String phone) {

        this.phone = phone;
    }

    /**
     * @param email sets email
     **/
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * @return firstName
     **/
    public String getFirstName() {

        return firstName;
    }

    /**
     * @return lastName
     **/
    public String getLastName() {

        return lastName;
    }

    /**
     * @return street
     **/
    public String getStreet() {
        return street;
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @return state
     */
    public String getState() {
        return state;
    }

    /**
     * @return zip
     **/
    public Integer getZip() {
        return zip;
    }

    /**
     * @return phone
     **/
    public String getPhone() {
        return phone;
    }

    /**
     * @return email
     **/
    public String getEmail() {
        return email;
    }
}
