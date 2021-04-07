package challenges.utilities;

import org.junit.Test;


import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void multiBracketValidation() {
        String[] shouldBeTrue = {"{}", "{}(){}", "()[[Extra Characters]]", "(){}[[]]", "{}{Code}[Fellows](())", ""};
        String[] shouldBeFalse = {"[({}]", "(](", "{(})" };

        for (String string: shouldBeTrue) {
            assertTrue(string + " is true", MultiBracketValidation.multiBracketValidation(string));
        }
        for (String string: shouldBeFalse) {
            assertFalse(string + " is false", MultiBracketValidation.multiBracketValidation(string));
        }
    }
}