import org.jetbrains.annotations.NotNull;


public class MatchingBrackets {

    public boolean isMatch(@NotNull String input) {

        int countLeft = 0;
        int countRight = 0;
        int bracketCounter = 0;
        char leftBracket = '{';
        char rightBracket = '}';
        char response = 'f';
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


/*            if (slotValue == leftBracket)
            {
                countLeft ++;
            }
            if (slotValue == rightBracket)
            {
                countRight ++;
            }

        }
*/
        //If all brackets have a matching pair, response equals true.
        if (bracketCounter == 0) {
//          response = 't';
            result = true;
        }

        //Verify that left bracket comes before right bracket.  --Needs work!
/*
        for (char slotValue : letterPlace) {
            System.out.println(slotValue);
            if (slotValue == rightBracket  && slotValue < the slot value for leftBracket)
            {
                response ='f';
            }
        }
*/
        //Response - update this to whatever the logic provides (not hard coded true).  Need to have order and matching as well.
//        if (response == 't')
//            return true;
//        if (response == 'f')
//            return false;
        return result;
    }
}
