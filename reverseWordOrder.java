/*
 * https://www.codestepbystep.com/problem/view/java/strings/reverseWordOrder
 * 5.25.24
 */

public static String reverseWordOrder(String s) {
    s = s.trim();
    StringBuilder result = new StringBuilder();
    StringBuilder current = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
        char curChar = s.charAt(i);
        if (curChar == ' ' && s.length() > i + 1 && s.charAt(i + 1) != ' ') {
            current = current.reverse();
            result.append(current + " ");
            current = new StringBuilder();
        } else if (curChar != ' ') {
            current.append(curChar);
            if (i == 0) {
                current = current.reverse();
                result.append(current);
            }
        }
    }
    return result.toString();

}

/*
 * public static String reverseWordOrder(String s) {
 * String[] arr = s.trim().split("\\s+");
 * Collections.reverse(Arrays.asList(arr));
 * 
 * return String.join(" ", arr);
 * 
 */

/*
 * public static String reverseWordOrder(String s) {
 * 
 * List<String> list = new ArrayList<>();
 * 
 * s = s.trim();
 * 
 * int i = 0;
 * int start = 0;
 * 
 * 
 * for (; i < s.length(); i++){
 * if (s.charAt(i) == ' ' && s.charAt(i-1) != ' '){
 * list.add(s.substring(start, i));
 * }
 * 
 * if (s.charAt(i) != ' ' && i > 0 && s.charAt(i-1) == ' '){
 * start = i;
 * }
 * 
 * if (i == s.length() -1){
 * list.add(s.substring(start));
 * }
 * }
 * 
 * System.out.println(list.size());
 * Collections.reverse(list);
 * return String.join(" ", list);
 * }
 * 
 */