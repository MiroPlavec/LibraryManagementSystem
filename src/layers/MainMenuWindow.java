package layers;

import helpers.Helper;

public class MainMenuWindow {

    //private static MainMenuWindow window = null;
    private SignUpWindow signUpWindow;

    private boolean isAppEnd = false;

    private void initializeApp(){
        signUpWindow = new SignUpWindow();
    }

    public void startApp(){
        initializeApp();

        do{
            Helper.clearConsole();

            showIntroduction();

            showOptions();

            isAppEnd = processUserInput();


        }while(!isAppEnd);
    }

    private boolean processUserInput(){
        String input = Helper.scanner.nextLine();
        switch (input.charAt(0)){
            case '1' :
                System.out.println("");
                break;
            case '2':
                signUpWindow.collectUserInformation();
                break;
            case '3':
                System.out.println("Good Day");
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

        System.out.println("to our library.");

    }

    private void showOptions(){
        System.out.println("Please select from listed options by entering corresponded number.");
        System.out.println("1.) Log in \n2.) Sign up \n3.) Quit");
    }

}
