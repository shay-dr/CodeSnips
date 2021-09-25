import org.jetbrains.annotations.NotNull;


public class MatchingBrackets {

    public boolean isMatch(@NotNull String input) {

        int bracketCounter = 0;
        char leftBracket = '{';
        char rightBracket = '}';
        Boolean result = null;


        //Obtain string, scan for, and count brackets {,}.
        char[] letterPlace = input.toCharArray();


        for (char slotValue : letterPlace) {
            System.out.println(slotValue);

            if (slotValue == rightBracket && bracketCounter <= 0) {
                bracketCounter = -1;
                result = false;
                break;
            }
            if (slotValue == rightBracket) {
                bracketCounter--;
            }

            if (bracketCounter <= 0) {
                result = false;
            }
            if (slotValue == leftBracket) {
                bracketCounter++;
            }
        }

        //If all brackets have a matching pair, response equals true.
        if (bracketCounter == 0) {
            result = true;
        }

        return result;
    }
}
