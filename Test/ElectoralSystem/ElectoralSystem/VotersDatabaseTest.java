package ElectoralSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VotersDatabaseTest {
    VotersDatabase vd;
    @BeforeEach
    void setUp() {
        vd = new VotersDatabase();
    }

    @Test
    public void votersDatabase_isEmptyIsTrueTest() {
        assertTrue(vd.isEmpty());
    }

    @Test
    public void VoterA_isAddedToTheDatabase_isEmptyIsFalseTest() {
        String[] values = {"Emmanuel","Emmax2009#","olatunjie335@gmail.com","20"};
        vd.add("Emmanuel",values);
        assertFalse(vd.isEmpty());
    }

    @Test
    public void VoterA_isAddedToTheDatabase_getVoterADetails_isEmptyIsFalseTest() {
        String[] values = {"Emmanuel","Emmax2009#","olatunjie335@gmail.com","20"};
        vd.add("Emmanuel",values);
        assertFalse(vd.isEmpty());

        assertEquals(values,vd.getValues("Emmanuel"));
    }





}