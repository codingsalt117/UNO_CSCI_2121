/**
 * @author Robin Johnson
 * @version Lab04 String and Exception
 * 
 */

import java.util.*;

public class StringUtility {

    /**
     *This method takes in a sentence as a parameter and returns the reverse of the sentence by word. For this particular problem, we will convert all our sentences to lowercase. The result should only return the strings separated by a single space, although the input may contain multiple spaces in between them.
     *
     * <br>
     * Example:
     *
     * <pre>
     * reverse("This is a SENTENCE") will return "sentence is a this".
     * reverse("This         SENTENCE") will return "sentence this".
     * </pre>
     *
     * @param sentence The original sentence to be reversed
     * @return Reverse of the given statement
     */
    public static String reverse(String sentence) {
        String[] words = sentence.replaceAll("[^a-zA-Z ]", " ").replaceAll(" +", " ").toLowerCase().split("\\s+");
        StringBuilder reverseString = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverseString.append(words[i]).append(" ");
        }
        return reverseString.toString().trim();
 
    }

    /**
     *This method takes a sentence and counts the max occurring character. It ignores all the spaces, punctuations, digits and converts all the uppercase to lowercase letters.
     *
     * Example:
     *
     * <pre>
     * maxOccuringCharacter("iiiiiii") = 'i'
     * maxOccuringCharacter("Iiijjj") = 'i'
     * </pre>
     *
     * @param sentence The original sentence from which we should find the max
     *                 occuring character.
     * @return The max occuring character. If there are multiple max occuring
     *         character return the first character by alphabetical order
     * @throws IllegalArgumentException if the given sentence is empty (length of
     *                                  sentence = 0)
     */
    public static char maxOccuringCharacter(String sentence) throws IllegalArgumentException {
        if (sentence.equals("")){
            throw new IllegalArgumentException();
        }
        sentence = sentence.replaceAll("[^a-zA-Z ]", " ").replaceAll(" +", "").toLowerCase().trim();
        char lacalArray[] = sentence.toCharArray(); 
        Arrays.sort(lacalArray); 
        String words = new String(lacalArray);
        int wc = words.length();
        int max_count = 0;
        int count = 1;
        char result = '-';
        for (int i = 1; i <= wc; i++){
            if ((i == wc) || (words.charAt(i) != words.charAt(i - 1))){
                if (max_count < count){
                    max_count = count;
                    result = words.charAt(i-1);
                }
                count = 1;
            }
            else{
                count++;
            }
        }
        return result;

    }
        
    
    /**
     * This method checks whether the given string is a palindrome or not. A palindrome is a word, number, phrase, or other sequences of characters that read the same backward as forward, such as madam or racecar. An empty string is considered to be a palindrome.
     *
     * @param input The string to check
     * @return true if the given string is a palindrome and false otherwise
     */    
    public static boolean isPalindrome(String input) {
        int n = input.length();
        for (int i = 0; i < (n/2); ++i) {
            if (input.charAt(i) != input.charAt(n - i - 1)) {
            return false;
            }
        }
        return true;
    }
}
