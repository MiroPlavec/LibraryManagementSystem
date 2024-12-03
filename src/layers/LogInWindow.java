package layers;

import helpers.Helper;
import usermanagement.Customer;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LogInWindow {


    public Customer logInUser(List<Customer> customers){

        Customer customer = null;

        System.out.print("Enter your email: ");
        String email = Helper.scanner.nextLine();

        for(Customer c : customers){
            if(email.equals(c.getEmail())) customer = c;
        }

        if(customer == null) {
            System.out.println("Email was not found. Returning to Main Menu.");
            try {
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e){
                System.out.println(e.getStackTrace());
            }
            return null;
        }


        byte passwordChange = 0;
        String password;

        do{
            System.out.print("Enter your password: ");
            password = Helper.scanner.nextLine();
            if(!password.equals(customer.getPassword())){
                System.out.println("Incorrect password.");
            }else{
                break;
            }
            passwordChange++;
        }while(passwordChange<3);

        if(!password.equals(customer.getPassword())){
            System.out.println("Your password in all options was incorrect. Returning to Main Menu.");
            try {
                TimeUnit.SECONDS.sleep(2);
            }catch (InterruptedException e){
                System.out.println(e.getStackTrace());
            }
        }

        return customer;
    }


}
