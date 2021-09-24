package codeTests;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchingBrackets {

    public static void main(String[] args) {

        int countLeft = 0;
        int countRight = 0;


        //Init post
        System.out.println("Thank you for using MatchingBrackets /n" + "Please provide a string to be tested and press the 'Enter' key:");
        Scanner input = new Scanner(System.in);

        //Obtain string and scan for brackets {,}.  Regex: /\{|\}/g
        String userInput = input.next();

        Pattern regex = Pattern.compile("[$&+,:;=\\\\?@#|/'<>.^*()%!-]");

        if (regex.matcher(your_string).find()) {
            Log.d("TTT, "SPECIAL CHARS FOUND");
            return;
        }


        //Store brackets counts.



        //Ensure that a bracket has a corresponding pair.



        //If all brackets have a matching pair, return true.  Else, return false.

    }
}
