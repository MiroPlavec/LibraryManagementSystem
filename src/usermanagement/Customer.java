package usermanagement;

public class Customer extends User{

    public Customer(String firstName, String lastName, String email, String password, String gender, String phoneNumber, String address) {
        super(firstName, lastName, email, password, gender, phoneNumber, address);
    }

    public String getEmail(){
        return email;
    }

    public String getPassword(){
        return password;
    }

}
