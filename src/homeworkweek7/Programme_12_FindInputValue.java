package homeworkweek7;

import java.util.Scanner;

/*
Write a program that tells us input value is number or an alphabet or symbol.
*/

public class Programme_12_FindInputValue {

    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character: ");
        char character = scanner.next().charAt(0);

        //Object Creation

        Programme_12_FindInputValue inputValue = new Programme_12_FindInputValue();
        inputValue.checkInputValueIsAlphabetNumberOrSymbol(character);

        //Closing the scanner object
        scanner.close();
    }

    public void checkInputValueIsAlphabetNumberOrSymbol(char character){
        // Find the input value is Alphabet, Digit and Symbol
        if ((character>='a' && character<='z')||(character>='A' && character<='Z')){
            System.out.println(character + " is an alphabet.");
        }else if (character >= '0' && character <= '9'){
            System.out.println(character + " is a digit.");
        }else {
            System.out.println(character + " is a symbol.");
        }
    }
}
