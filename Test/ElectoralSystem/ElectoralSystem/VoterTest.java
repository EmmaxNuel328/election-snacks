

package ElectoralSystem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoterTest {

    @Test
    public void voterAis17_isEligibleIsFalseTest() {
        Voter voterA = new Voter();
        voterA.register("Emmanuel","Emmax2009#","olatunjie335@gmail.com",17);
        assertFalse(voterA.isEligible());
    }

    @Test
    public void voterAis18_isEligibleIsTrueTest() {
        Voter voterA = new Voter();
        voterA.register("Emmanuel","Emmax2009#","olatunjie335@gmail.com",18);
        assertTrue(voterA.isEligible());
    }

    @Test
    public void voterAis20HeVotesForPDP_numberOfVoteIs1_isEligibleIsTrueTest() {
        Voter voterA = new Voter();
        voterA.register("Emmanuel","Emmax2009#","olatunjie335@gmail.com",20);
        assertTrue(voterA.isEligible());

        voterA.vote("PDP");
        assertEquals(1, voterA.numberOfVote);
    }

    @Test
    public void voterAis20AndVoterBis34TheyVoteForPDP_numberOfVoteIs2_isEligibleIsTrueTest() {
        Voter voterA = new Voter();
        voterA.register("Emmanuel","Emmax2009#","olatunjie335@gmail.com",20);
        assertTrue(voterA.isEligible());
        Voter voterB = new Voter();
        voterB.register("Emmanuella","Emmax2009#","olatunjie335@gmail.com",34);
        assertTrue(voterB.isEligible());

        voterA.vote("PDP");
        voterB.vote("PDP");

        assertEquals(1, voterA.numberOfVote);
        assertEquals(1, voterB.numberOfVote);
    }

    @Test
    public void voterAis20HeRegistersThenWantsTOLoginButHeMadeMistakeWithTheUserName_isEligibleIsTrueTest() {
        Voter voterA = new Voter();
        voterA.register("Emmanuella","Emmax2009#","olatunjie335@gmail.com",34);
        voterA.login("Emmanuella","Emmax2009#");
    }






}