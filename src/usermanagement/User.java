package usermanagement;

public abstract class User {

    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;


    public User(String firstName, String lastName, String gender, String email, String password, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public User(String firstName, String lastName, String email, String password){
        this(firstName, lastName, "", email, password, "", "");
    }

}
