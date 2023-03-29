class Solution {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = "";
        for(int i = s.length()-1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return s.equals(reversed) ? true : false;
    }
}