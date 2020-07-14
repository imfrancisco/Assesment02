package com.stayready.assessment.week2.part01;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        String wholeWord = string1 + string2;
        return wholeWord;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder aStringBuilder = new StringBuilder(string1);
        return aStringBuilder.reverse().toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuilder aStringBuilder = new StringBuilder(string1);
        StringBuilder aSB = new StringBuilder(string2);
        return aStringBuilder.reverse().toString() + aSB.reverse().toString();
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        StringBuilder aStringBuilder = new StringBuilder(charactersToRemove);
        String reverseLetters = aStringBuilder.reverse().toString();
        return string.replace(reverseLetters, "");

//        StringBuilder aStringBuilder = new StringBuilder(string);
//        String rWord = "";
//        for(int index = 0; index < string.length();index++) {
//            if (string.equals(charactersToRemove)) {
//                rWord += string.replace(charactersToRemove, "");
//            }
//        }return rWord;


//        char[] charArray = string.toCharArray();
//        String new_Str = "";
//        for (int i = 0; i < charArray.length; i++) {
//            if (!(i == 0 || i == 6))// (i == 1 || i == 2 || i == 3)
//                new_Str += charArray[i];
//        }
//        return new_Str;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        StringBuilder aStringBuilder = new StringBuilder(charactersToRemove);
        String reversedLetters = aStringBuilder.reverse().toString();
        return string.replace(reversedLetters, "");
    }
}
