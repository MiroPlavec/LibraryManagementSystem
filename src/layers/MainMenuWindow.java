package layers;

import helpers.Helper;
import usermanagement.Customer;
import usermanagement.User;

import java.util.ArrayList;
import java.util.List;

public class MainMenuWindow {


    private SignUpWindow signUpWindow;
    private LogInWindow logInWindow;


    private List<Customer> customers = new ArrayList<>();
    private User currentUser;

    private boolean isAppEnd = false;


    public void startApp(){
        initializeApp();

        do{
            Helper.clearConsole();

            showIntroduction();

            showOptions();

            isAppEnd = processUserInput();


        }while(!isAppEnd);
    }

    private void initializeApp(){
        customers = createCustomers();

        signUpWindow = new SignUpWindow();
        logInWindow = new LogInWindow();
    }

    private List<Customer> createCustomers(){
        List<Customer> artificialCustomers = new ArrayList<>();
        artificialCustomers.add(new Customer("Jake", "Noah", "jake.noah@gmail.com", "123", "", "", ""));
        artificialCustomers.add(new Customer("Mike", "Hos", "mike.Hos@gmail.com", "123", "", "", ""));
        artificialCustomers.add(new Customer("Peter", "Bolt", "peter.bolt@gmail.com", "123", "", "", ""));

        return artificialCustomers;
    }

    private boolean processUserInput(){
        String input = Helper.scanner.nextLine();
        switch (input.charAt(0)){
            case '1' :
                Customer customer = logInWindow.logInUser(customers);
                if(customer != null) currentUser = customer;
                break;
            case '2':
                signUpWindow.collectUserInformation(customers);
                break;
            case '3':
                System.out.println("Good by!");
                return true;
            default:
                break;
        }
        return false;
    }

    private void showIntroduction(){
        System.out.println(" __          ________ _      _____ ____  __  __ ______ \n" +
                " \\ \\        / /  ____| |    / ____/ __ \\|  \\/  |  ____|\n" +
                "  \\ \\  /\\  / /| |__  | |   | |   | |  | | \\  / | |__   \n" +
                "   \\ \\/  \\/ / |  __| | |   | |   | |  | | |\\/| |  __|  \n" +
                "    \\  /\\  /  | |____| |___| |___| |__| | |  | | |____ \n" +
                "     \\/  \\/   |______|______\\_____\\____/|_|  |_|______|\n" +
                "                                                       \n" +
                "                                                       ");

        if(currentUser != null){
            System.out.println("I hope you have a great day " + currentUser.getFirstName() + " " + currentUser.getLastName());
            System.out.println();
        }

    }

    private void showOptions(){
        System.out.println("Please select from listed options by entering corresponded number.");
        System.out.println("1.) Log in \n2.) Sign up \n3.) Quit");
    }

}
