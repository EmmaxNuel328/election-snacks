package ElectoralSystem;


import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;


public class EvotersApp {

    public static String collectInput(String message){
        String userChoice;
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return userChoice = sc.next();
    }
    public static PartyName collectInput3(String message){
        PartyName userInput;
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        return userInput = PartyName.valueOf(sc.next());
    }

    public  static int collectInput2(String message){
        int userChoice;
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return userChoice = sc.nextInt();
    }

    public static void displayDashBoard(){
        String dashBoard = """
                Welcome to EMMAX Election System!
                1. Vote
                2. View Profile
                3. Check result
                0. Exit
                """;
        System.out.println(dashBoard);
    }

    public static void displaySignInMenu(){
        String SignInMenu = """
                Welcome to EMMAX Election System!
                1. Register
                2. Login
                0. Exit
                """;
        System.out.println(SignInMenu);
    }

    public static void displayPartyMenu(){
        PartyName partyName1 = PartyName.PDP;
        PartyName partyName2 = PartyName.APC;
        PartyName partyName3 = PartyName.LP;

        System.out.println("Party Name:" + partyName1.name());
        System.out.println("Party Name:" + partyName2.name());
        System.out.println("Party Name:" + partyName3.name());
    }



    public static void main(String[] args) {
        Voter voter = new Voter();
        PasswordChecker checker = new PasswordChecker();
        while (true){





                    displaySignInMenu();
                    String userChoice = collectInput("Enter your choice: ");
                    switch (userChoice){
                        case "1" -> {
                            String name = collectInput("Enter your name: ");
                            String password;
                            while (true) {
                                password = collectInput("Enter your password: ");
                                boolean check = checker.isStrong(password);
                                if (!check) System.out.println("WEAK PASSWORD!"); else break;
                            }
                            String email =  collectInput("Enter your email: ");
                            int age = collectInput2("Enter your age: ");
                            System.out.println(" ");
                            voter.register(name, password, email, age);
                        }

                        case "2" -> {
                            String name = collectInput("Enter your name: ");
                            String password = collectInput("Enter your password: ");
                            System.out.print(" ");
                            System.out.println(voter.login(name,password));
                            if(voter.login(name,password) == "Invalid username or password"){
                                System.out.println("OOOPPPPPSSSS!!!");
                            }
                            else {
                                while (true) {
                                    displayDashBoard();
                                    String userDashBoardChoice = collectInput("Enter your choice: ");
                                    switch (userDashBoardChoice) {
                                        case "1" -> {
                                            try {
                                                PartyName partyName = collectInput3("Enter your party name: ");
                                                voter.vote(partyName);
                                            }
                                            catch(IllegalArgumentException e){
                                                displayPartyMenu();
                                                System.out.println("Please enter a valid party name");
                                            }
                                        }

                                        case "2" -> {
                                            voter.viewProfile();
                                        }

                                        case "3" -> {
                                            voter.checkResult();
                                        }
                                    }
                                }


                        }
                    }

                }


            }
            }
        }










