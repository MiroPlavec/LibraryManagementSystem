package usermanagement;

public abstract class User {

    private String firstName;
    private String lastName;
    private String gender;

    public User(String firstName, String lastName, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public User(String firstName, String lastName){
        this(firstName, lastName, "");
    }
}
