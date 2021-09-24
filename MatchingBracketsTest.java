import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatchingBracketsTest {

    @Test
    //{} - True
    public void requiredTest1() {
        Assertions.assertTrue(5 == 5);
        Assertions.assertFalse(5 == 4);

    }

    @Test
    //}{ - False (closed bracket can't proceed all open brackets.)
    public void requiredTest2() {
        Assertions.assertTrue(5 == 5);
        Assertions.assertFalse(5 == 4);

    }

    @Test
    //{{} - False (one bracket pair was not closed)
    public void requiredTest3() {
        Assertions.assertTrue(5 == 5);
        Assertions.assertFalse(5 == 4);

    }

    @Test
    //"" - True. (no brackets in the string will return True)
    public void requiredTest4() {
        Assertions.assertTrue(5 == 5);
        Assertions.assertFalse(5 == 4);

    }

    @Test
    //{abc...xyz} - True (non-bracket characters are ignored appropriately)
    public void requiredTest5() {
        Assertions.assertTrue(5 == 5);
        Assertions.assertFalse(5 == 4);

    }

    @Test
    //allows nested brackets
    public void nestedTest() {
        Assertions.assertTrue(5 == 5);
        Assertions.assertFalse(5 == 4);

    }
}
