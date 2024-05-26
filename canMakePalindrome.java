/*
 * https://www.codestepbystep.com/problem/view/java/strings/canMakePalindrome
 * 1.20.24
 * 
 */


 public static boolean canMakePalindrome(String s) {
    int left = 0;
    int right = s.length() -1;
    
    while (left < right){
        if (s.charAt(right) != s.charAt(left)){
            return isPalindrome(s, left +1, right) ||
                isPalindrome(s, left, right-1);
            
        }
        left++;
        right--;
        
    }
    
	return true;
}

private static boolean isPalindrome(String s, int left, int right){
    
    while (left < right){
        if (s.charAt(right) != s.charAt(left)){
            return false;
        }
        left++;
        right--;
    }
    return true;
}