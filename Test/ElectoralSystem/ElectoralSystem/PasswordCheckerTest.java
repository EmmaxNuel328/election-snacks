package ElectoralSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {
    PasswordChecker checker;
    @BeforeEach
    void setUp(){
        checker = new PasswordChecker();
    }
    @Test
    public void Emmanuel_sPasswordIsABCD_isGreaterThanSixIsFalseTest(){
        assertFalse(checker.checkPasswordForLength("ABCD"));
    }

    @Test
    public void Emmanuel_sPasswordIsEmmax2009_isGreaterThanSixIsTrueTest(){
        assertTrue(checker.checkPasswordForLength("Emmax2009"));
    }

    @Test
    public void Emmanuel_sPasswordIsEmmax2009_isGreaterThanSixIsTrueTest_GetNumberOfLowerCaseIs4Test(){
        assertTrue(checker.checkPasswordForLength("Emmax2009"));

        assertEquals(4, checker.getNumberOfLowerCase("Emmax2009"));
    }

    @Test
    public void Emmanuel_sPasswordIsEmmax2009_isGreaterThanSixIsTrueTest_GetNumberOfUpperCaseIs1Test(){
        assertTrue(checker.checkPasswordForLength("Emmax2009"));
        assertEquals(4, checker.getNumberOfLowerCase("Emmax2009"));
        assertEquals(1,checker.getNumberOfUpperCase("Emmax2009"));
    }


    @Test
    public void Emmanuel_sPasswordIsEmmax2009_IsGreaterThanSixIsTrueTest_GetNumberOfDigitsIs4Test(){
        assertTrue(checker.checkPasswordForLength("Emmax2009"));

        assertEquals(4,checker.getNumberOfLowerCase("Emmax2009"));
        assertEquals(1,checker.getNumberOfUpperCase("Emmax2009"));
        assertEquals(4,checker.getNumberOfDigit("Emmax2009"));
    }

    @Test
    public void Emmanuel_sPasswordIsEmmax2009$_IsGreaterThanSixIsTrueTest_GetNumberOfSymbolsIs1Test(){
        assertTrue(checker.checkPasswordForLength("Emmax2009$"));

        assertEquals(4,checker.getNumberOfLowerCase("Emmax2009$"));
        assertEquals(1,checker.getNumberOfUpperCase("Emmax2009$"));
        assertEquals(4,checker.getNumberOfDigit("Emmax2009$"));
        assertEquals(1,checker.getNumberOfSymbol("Emmax2009#"));
    }

    @Test
    public void Emmanuel_sPasswordIsEmmax2009$_IsStrongIsTrueTest(){
        assertTrue(checker.checkPasswordForLength("Emmax2009$"));
//        assertTrue(checker.isStrong("Emmax2009$"));
    }

}