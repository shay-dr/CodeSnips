import org.jetbrains.annotations.NotNull;


public class MatchingBrackets {

    public boolean isMatch(@NotNull String input) {

        int bracketCounter = 0;
        char leftBracket = '{';
        char rightBracket = '}';
        Boolean result = null;


        // Obtain string and identify index to char.
        char[] letterPlace = input.toCharArray();

        // Check for
        for (char slotValue : letterPlace) {
            // If first bracket in the string is a right bracket, return false.
            if (slotValue == rightBracket && bracketCounter <= 0) {
                bracketCounter = -1;
                result = false;
                break;
            }

            // Subtract 1 from bracketCounter for each right bracket, add 1 for each left bracket.
            if (slotValue == rightBracket) {
                bracketCounter --;
            }
            if (slotValue == leftBracket) {
                bracketCounter ++;
            }

            // If bracket counter is not = 0, return false.
            if (bracketCounter <= 0) {
                result = false;
            }
            if (bracketCounter >= 0) {
                result = false;
            }
        }

        // If all brackets have a matching pair, response equals true.
        if (bracketCounter == 0) {
            result = true;
        }

        return result;
    }
}
