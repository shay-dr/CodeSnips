import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchingBrackets {

    public static void main(String[] args) {

        int countLeft = 0;
        int countRight = 0;


        //Init post
        System.out.println("Thank you for using MatchingBrackets \n" + "Please provide a string to be tested and press the 'Enter' key:");
        Scanner input = new Scanner(System.in);

        //Obtain string and scan / count bracket {,}.
        String userInput = input.next();
        char[] letterPlace = userInput.toCharArray();

        for (char slotValue : letterPlace) {
            System.out.println(slotValue);
        }


        //If all brackets have a matching pair, return true.  Else, return false.


        //Response


    }
}
