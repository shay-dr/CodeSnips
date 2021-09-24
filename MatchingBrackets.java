package codeTests;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchingBrackets {

    public static void main(String[] args) {

        int countLeft = 0;
        int countRight = 0;
        string response = null;


        //Init post
        System.out.println("Thank you for using MatchingBrackets /n" + "Please provide a string to be tested and press the 'Enter' key:");
        Scanner input = new Scanner(System.in);

        //Obtain string and scan / count bracket {,}.  Regex: /\{|\}/g
        String userInput = input.next();

        Pattern regex = Pattern.compile("{}");

        if (regex.matcher(userInput).find({)) {
            countLeft ++;

        }
        if (regex.matcher(userInput).find(})) {
            countRight ++;

        }

        //If all brackets have a matching pair, return true.  Else, return false.

        if countLeft = countRight(
                response  = True
        )

        //Response

        System.out.println(response);

    }
}
