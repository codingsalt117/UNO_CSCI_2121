






/**
     public static String reverse(String s) {
       if (s.isEmpty()){
            return s;
       } 
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static boolean isPalindrome(String s) {
      String sCopy = s;
      if (s.isEmpty()){
      	return true;
      }
      else {
      	String revword = reverse(s.substring(1)) + s.charAt(0);
      	if(revword.equals(sCopy)){
      		return true;
      	}
      	else{
      	 return false;
      	}
      }
*/