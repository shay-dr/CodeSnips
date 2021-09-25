import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatchingBracketsTest {
    MatchingBrackets doesItWork = new MatchingBrackets();

    @Test
    //{} - True
    public void requiredTest1() {
        Assertions.assertTrue(doesItWork.isMatch("{}"));
    }

    @Test
    //}{ - False (closed bracket can't proceed all open brackets.)
    public void requiredTest2() {
        Assertions.assertFalse(doesItWork.isMatch("}{"));
    }

    @Test
    //{{} - False (one bracket pair was not closed)
    public void requiredTest3() {
        Assertions.assertFalse(doesItWork.isMatch("{{}"));
    }

    @Test
    //"" - True. (no brackets in the string will return True)
    public void requiredTest4() {
        Assertions.assertTrue(doesItWork.isMatch(""));
    }

    @Test
    //{abc...xyz} - True (non-bracket characters are ignored appropriately)
    public void requiredTest5() {
        Assertions.assertTrue(doesItWork.isMatch("{abc...xyz}"));
    }

    @Test
    //{abc.ABC.123.xyz} - True (non-bracket characters are ignored appropriately)
    public void numbersOrLettersTest5() {
        Assertions.assertTrue(doesItWork.isMatch("{abc.ABC.123.xyz}"));
    }

    @Test
    //allows nested brackets
    public void nestedTest() {
        Assertions.assertTrue(doesItWork.isMatch("{{}}"));
    }

    @Test
    //allows nested brackets
    public void dualNestedTest() {
        Assertions.assertTrue(doesItWork.isMatch("{{}{}}"));
    }

    @Test
    //allows nested brackets
    public void dualNestedWithLetterOrNumberTest() {
        Assertions.assertTrue(doesItWork.isMatch("{[{}aA1{}]}"));
    }

    @Test
    //allows nested brackets
    public void dualNestedWithASpecialCharTest() {
        Assertions.assertTrue(doesItWork.isMatch("{[{},*$^{}]}"));
    }

    @Test
    //allows nested brackets with additional chars
    public void nestedAndAdditionalCharsTest() {
        Assertions.assertTrue(doesItWork.isMatch("{sdaf{231}ASDFA}"));
    }

    @Test
    //allows spaces
    public void spacesTest() {
        Assertions.assertTrue(doesItWork.isMatch(" { sd af{ 231} ASljn DF123A}"));
    }

    @Test
    //multiple right brackets after a matched bracket
    public void trailingMultipleRightBracketsTest() {
        Assertions.assertFalse(doesItWork.isMatch("{}}}{{"));
    }
}
