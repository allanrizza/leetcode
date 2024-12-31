class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int startIndex = 0;
        int reversedIndex = s.length()-1;
        while(startIndex <= reversedIndex) {
            char currFirst = s.charAt(startIndex);
            char currLast = s.charAt(reversedIndex);
            if(currFirst != currLast) {
                return false;
            } else {
                startIndex++;
                reversedIndex--;
            }
        }
        return true;
    }
}