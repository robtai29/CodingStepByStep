/*
 * https://www.codestepbystep.com/problem/view/java/strings/addCommas
 * 1.20.24
 * 
 */

 public static String addCommas(String digits) {
    StringBuilder sb = new StringBuilder();
    
    int num = 0;
    for (int i = digits.length() -1; i >= 0; i--){
        sb.append(digits.charAt(i));
        num++;
        if (num %3 == 0 && i > 0){
            sb.append(',');
        }
    }
    
    return sb.reverse().toString();
}