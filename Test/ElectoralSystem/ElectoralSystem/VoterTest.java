

package ElectoralSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoterTest {
    Voter voterA;
    @BeforeEach
    void setUp() {
        voterA = new Voter();
    }

    @Test
    public void voterAis17_isEligibleIsFalseTest() {
        voterA.register("Emmanuel","Emmax2009#","olatunjie335@gmail.com",17);
        assertFalse(voterA.isEligible());
       assertEquals("Invalid username or password",voterA.login("Emmanuel","Emmax2009#"));
    }

    @Test
    public void voterAis18_isEligibleIsTrueTest() {
        voterA.register("Emmanuel","Emmax2009#","olatunjie335@gmail.com",18);
        assertTrue(voterA.isEligible());
    }

    @Test
    public void voterAis20HeVotesForPDP_numberOfVoteIs1_isEligibleIsTrueTest() {
        voterA.register("Emmanuel","Emmax2009#","olatunjie335@gmail.com",20);
        assertTrue(voterA.isEligible());

        voterA.vote(PartyName.PDP);
        assertEquals(1, voterA.numberOfVote);
    }

    @Test
    public void voterAis20AndVoterBis34TheyVoteForPDP_numberOfVoteIs2_isEligibleIsTrueTest() {
        voterA.register("Emmanuel","Emmax2009#","olatunjie335@gmail.com",20);
        assertTrue(voterA.isEligible());
        Voter voterB = new Voter();
        voterB.register("Emmanuella","Emmax2009#","olatunjie335@gmail.com",34);
        assertTrue(voterB.isEligible());

        voterA.vote(PartyName.PDP);
        voterB.vote(PartyName.APC);

        assertEquals(1, voterA.numberOfVote);
        assertEquals(1, voterB.numberOfVote);
    }

    @Test
    public void voterAis34HeRegistersThenLogsIn_isEligibleIsTrueTest() {
        voterA.register("Emmanuella","Emmax2009#","olatunjie335@gmail.com",34);
        assertTrue(voterA.isEligible());
        assertEquals("Login Successful", voterA.login("Emmanuella","Emmax2009#"));
    }

    @Test
    public void voterAis24HeRegistersThenHeTriesToLoginButMadeMistakeWithHisUsername_isEligibleIsTrueTest() {
        voterA.register("Emmax","Emmax2009#","olatunjie355@gmail.com",24);
        assertTrue(voterA.isEligible());
        assertEquals( "Invalid username or password", voterA.login("emmax","Emmax2009#"));
    }

    @Test
    public void voterAis24HeTriesToRegistersButHisPasswordDidNotReachTheConditionTest() {
        voterA.register("Emmax","Emmax","olatunjie355@gmail.com",24);
        assertTrue(voterA.isEligible());
//        assertFalse(voterA.checkPassword("Emmax"));
    }







}