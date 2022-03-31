/**
 * @author Robin Johnson
 * @version Lab06 Recursion
 * 
 * need a base case
 * and a recusion step
 */
public class Recursion {
    
    public static String reverse(String s) {
       
       if (s.isEmpty()){
            return s;
       } 
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static boolean isPalindrome(String s) {
        
        if (s.equals(reverse(s))){
            return true;
        }
        else {
            return false;
        }
        
    }

    public static int length(String s) {
        
        if (s.equals("")){
            return 0;
        } 

        else{
            return length(s.substring(1)) + 1;
        }
    }
}