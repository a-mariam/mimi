package DSAandAlgorithms.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LetterCombinationOfThePhoneTest {

    @Test
    public void testThat_LetterCombinationOfThePhone_IsNotNull(){
      LetterCombinationOfThePhone letter = new LetterCombinationOfThePhone();
      assertNotNull(letter);
    }
    @Test
    public void testThat_LetterCombinationOfThePhone_Returns_(){
        assertEquals("ABC", LetterCombinationOfThePhone.match("2"));
        assertEquals("ABCDEF", LetterCombinationOfThePhone.match("23"));
        assertEquals("WXYZ", LetterCombinationOfThePhone.match("9"));
        assertEquals("[]", LetterCombinationOfThePhone.match(""));

    }
}