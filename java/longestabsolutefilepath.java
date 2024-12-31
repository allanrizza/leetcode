import java.util.Stack;

class Solution {
    public int lengthLongestPath(String input) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        int maxLen = 0;

        for(String s : input.split("\n")) {
            int level = s.lastIndexOf("\t")+1;
            int length = s.length() - level;
            while(stack.size() > level + 1) {
                stack.pop();
            }
            if(s.contains(".")) {
                maxLen = Math.max(maxLen, stack.peek() + length);
            } else {
                stack.push(stack.peek() + length + 1);
            }

        }
        return maxLen;
    }
}