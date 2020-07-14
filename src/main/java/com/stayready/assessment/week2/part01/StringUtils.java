package com.stayready.assessment.week2.part01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String padLeft = String.format("%" + amountOfPadding + "s", stringToBePadded).replace(" ", " ");
        return padLeft;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String padRight = String.format("%" + (-amountOfPadding) + "s", stringToBePadded).replace(" ", " ");
        return padRight;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String repeatedWord = "";
        for(int index = 1; index <= numberOfTimeToRepeat; index++){
            String rWord = new StringBuilder().append(stringToBeRepeated).toString();
            repeatedWord += rWord;
        }
        return repeatedWord;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {
        if (string.matches("^[a-zA-Z]*$")){
        return true;
        }
        return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        try{
        Double.parseDouble(string);
        return true;
        }
        catch(NumberFormatException e){
        return false;
    }
}

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*$");
        Matcher matcher = pattern.matcher(string);
        if (matcher.matches()) {
            return true;
        } else
            return false;
    }
}
