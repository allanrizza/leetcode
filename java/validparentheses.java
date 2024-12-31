import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        if(s.length() <= 1) return false;

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)) {
                case '(':
                case '[':
                case '{':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                case ']':
                case '}':
                if(stack.size() == 0) return false;
                    if(!stack.isEmpty()) {
                        Character pop = (Character) stack.pop();
                        if ((s.charAt(i) == ')' && pop != '(') ||
                        (s.charAt(i) == ']' && pop != '[') ||
                        (s.charAt(i) == '}' && pop != '{')) {
                            return false;
                        }
                    }
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
