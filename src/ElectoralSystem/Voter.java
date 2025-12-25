package ElectoralSystem;

public class Voter {
    private String username;
    private String password;
    private String email;
    private int age;
    private boolean isEligible;
    private String[] votersDetails = new  String[4];
    private int count;
    int numberOfVote;
    String politicalParty;


    VotersDatabase vd = new VotersDatabase();
    public void register(String username, String password, String email, int age) {
     this.username = username;
     this.password = password;
     this.email = email;
     this.age = age;
     votersDetails[0] = this.username;
     votersDetails[1] = this.password;
     votersDetails[2] = this.email;
     votersDetails[3] = this.age+"";

     vd.add(username,votersDetails);
    }

    public void login(String username,String password){
        if(votersDetails[0] != username || votersDetails[1] != password){
            System.out.println("Wrong username or password");
        }
    }
    public boolean isEligible() {
        isEligible = age >= 18;
        return isEligible;
    }

    public void vote(String partyName) {
        this.politicalParty = partyName;
        if(numberOfVote == 1) {
            System.out.println(username + " has already voted!!!");
        }
        else{
            numberOfVote++;
        }
    }



}
