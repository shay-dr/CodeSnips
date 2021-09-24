import org.jetbrains.annotations.NotNull;


public class MatchingBrackets {

    public boolean isMatch(@NotNull String input) {

        int countLeft = 0;
        int countRight = 0;
        char leftBracket = '{';
        char rightBracket = '}';
        char response = 'f';


        //Obtain string, scan for, and count brackets {,}.
        char[] letterPlace = input.toCharArray();

        for (char slotValue : letterPlace) {
            System.out.println(slotValue);
            if (slotValue == leftBracket)
            {
                countLeft ++;
            }
            if (slotValue == rightBracket)
            {
                countRight ++;
            }

        }

        //If all brackets have a matching pair, response equals true.
        if (countLeft == countRight) {
            response = 't';
        }

        //Verify that left bracket comes before right bracket.  --Needs work!

        for (char slotValue : letterPlace) {
            System.out.println(slotValue);
            if (slotValue == rightBracket  && slotValue < the slot value for leftBracket)
            {
                response ='f';
            }
        }

        //Response - update this to whatever the logic provides (not hard coded true).  Need to have order and matching as well.
        if (response == 't')
            return true;
        if (response == 'f')
            return false;
    }
}
