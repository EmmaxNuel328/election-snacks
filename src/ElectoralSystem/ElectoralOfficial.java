package ElectoralSystem;

import java.util.ArrayList;

public class ElectoralOfficial {
    private String officialName;
    private String officialId;
    private VotersDatabase  votersDatabase;
    static ArrayList<PartyName> votersForPdp = new ArrayList<>();
    static ArrayList<PartyName> votersForApc = new ArrayList<>();
    static ArrayList<PartyName> votersForLp = new ArrayList<>();


   public int  getNumberOfVotes(){
        int numberOfVotes = 0;
      for(int index = 0;index < votersForPdp.size();index++){
          numberOfVotes++;
       }
      for (int index = 0;index < votersForApc.size();index++){
          numberOfVotes++;
      }
      for (int index = 0;index < votersForLp.size();index++){
          numberOfVotes++;
      }

      return numberOfVotes;
    }



}
