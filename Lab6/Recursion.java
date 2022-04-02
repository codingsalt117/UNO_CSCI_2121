/**
 * @author Robin Johnson
 * @version Lab06 Recursion
 * 
 * need a base case
 * and a recusion step
 */
public class Recursion {
    
    public static String reverse(String s) {
       // Checks if string is empty
       if (s.isEmpty()){
            return s;
       } 
       // If not empty string is passed to the recursion step the reorders the first two indicies until string is in reverse order
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static boolean isPalindrome(String s) {
        // check if a string is reversed by calling reverse on "s" inside the equals call
        if (s.equals(reverse(s))){
            return true;
        }

        else {
            return false;
        }
        
    }

    public static int length(String s) {
        // Checks if string is empty
        if (s.equals("")){
            return 0;
        } 
        // returns a int value of the length of the string by using substring method and a sort of iterator, for every element is a new recursive method all.
        else{
            return length(s.substring(1)) + 1;
        }
    }
}