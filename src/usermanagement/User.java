package usermanagement;

public abstract class User {

    private String firstName;
    private String lastName;
    private String gender;
    protected String email;
    protected String password;
    private String phoneNumber;
    private String address;


    public User(String firstName, String lastName, String email, String password, String gender, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
