/*
 * https://www.codestepbystep.com/problem/view/java/strings/addBinary
 * 1.20.24
 * 
 */


 public static String addBinary(String a, String b) {
    int i = a.length() -1;
    int j = b.length() -1;
    StringBuilder sb = new StringBuilder();
    int carryover = 0;
    for (; i >=0 || j>=0; i--, j--){
        int ch1 = i>=0 ? a.charAt(i) - '0': 0;
        int ch2 = j>=0 ? b.charAt(j) - '0': 0;
            int sum = ch1 + ch2 + carryover;
            carryover = sum > 1 ? 1 : 0;
            int digit = sum % 2;
            sb.append(digit);
    }
    
    if (carryover > 0){
        sb.append(carryover);
    }
    
    return sb.reverse().toString();
}