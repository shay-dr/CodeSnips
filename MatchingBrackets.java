import org.jetbrains.annotations.NotNull;

import java.util.regex.Pattern;

public class MatchingBrackets {

    public boolean isMatch(@NotNull String input) {

        int countLeft = 0;
        int countRight = 0;

        //Obtain string and scan / count bracket {,}.
        char[] letterPlace = input.toCharArray();

        for (char slotValue : letterPlace) {
            System.out.println(slotValue);
        }

        //If all brackets have a matching pair, return true.  Else, return false.


        //Response - update this to whatever the logic provides (not hard coded true).  Need to have order and matching as well.
        return true;


    }
}
