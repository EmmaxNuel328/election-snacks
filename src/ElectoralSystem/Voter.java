package ElectoralSystem;

import java.util.Objects;

import static ElectoralSystem.ElectoralOfficial.*;


public class Voter {
    private String username;
    private String password;
    private String email;
    private int age;
    private boolean isEligible;
    private String[] votersDetails = new  String[4];
    private int count;
    int numberOfVote;
    private PartyName  partyName;


    public void register(String username, String password, String email, int age) {
     this.username = username;
     this.password = password;
     this.email = email;
     this.age = age;
     if(!isEligible()) {
         System.out.println("You are not eligible");
     }
     else {
         votersDetails[0] = this.username;
         votersDetails[1] = this.password;
         votersDetails[2] = this.email;
         votersDetails[3] = this.age + "";
     }
    }

    PasswordChecker checker = new PasswordChecker();

    public String login(String username,String password){
        if(!Objects.equals(votersDetails[0], username) || !Objects.equals(votersDetails[1], password)){
            return "Invalid username or password";
        }
       return "Login Successful";
    }
    
    public boolean isEligible() {
        isEligible = age >= 18;
        return isEligible;
    }

    ElectoralOfficial e = new ElectoralOfficial();
    public void vote(PartyName partyName) {
        this.partyName = partyName;
        PartyName partyName1 = PartyName.PDP;
        PartyName partyName2 = PartyName.APC;
        PartyName partyName3 = PartyName.LP;
       if(partyName ==  partyName1) {
           if(numberOfVote == 1) System.out.println("You have already voted"); else numberOfVote++; votersForPdp.add(partyName1);
       }
       else if(partyName ==  partyName2) {
           if(numberOfVote == 1) System.out.println("You have already voted"); else numberOfVote++; votersForApc.add(partyName2);
       }
       else if(partyName ==  partyName3) {
           if(numberOfVote == 1) System.out.println("You have already voted"); else numberOfVote++; votersForLp.add(partyName3);
           votersForLp.add(partyName3);
       }
       else{
           System.out.println("Party does not exist");
       }
    }

    public String checkResult(){
        return "";
    }

    public void checkPassword(String password) {
        this.password = password;
    }

    public void viewProfile(){
        System.out.println("Welcome " + this.username);
        System.out.println("Username: " + this.username);
        System.out.println("Email: " + this.email);
    }

}
