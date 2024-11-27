package usermanagement;

public class Customer extends User{


    public Customer(String firstName, String lastName, String gender) {
        super(firstName, lastName, gender);
    }

    public Customer(String firstName, String lastName){
        this(firstName, lastName, "");
    }


}
