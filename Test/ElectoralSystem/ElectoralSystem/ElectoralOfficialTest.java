package ElectoralSystem;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ElectoralOfficialTest {
    ElectoralOfficial official;
    @BeforeEach
    public void setUp() {
        official = new ElectoralOfficial();
    }



    @Test
    public void voterAAndVoterBVotesForPDP_NumberOfVotesIs2_isCorrectIsTrueTest() {

        Voter voterA = new  Voter();
        Voter voterB = new  Voter();

        voterA.register("Emmanuel","Emmax2009#","olatunjie335@gmail.com",25);
        voterB.register("emmax","Emmas2103#","esssss@gmail.com",24);
        voterA.vote(PartyName.PDP);
        voterB.vote(PartyName.PDP);


        assertEquals(3,official.getNumberOfVotes());
    }


    @Test
    public void voterAVotesForPDP_NumberOfVotesIs1_isCorrectIsTrueTest() {

        Voter voterA = new  Voter();


        voterA.register("Emmanuel","Emmax2009#","olatunjie335@gmail.com",25);
        voterA.vote(PartyName.PDP);

        assertEquals(1,official.getNumberOfVotes());
    }
}
