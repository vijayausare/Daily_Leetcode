class Solution {


    public boolean solutionReadAble(String s) {
        Stack<Character> stack = new Stack<>();

        for(Character ch: s.toCharArray()) {
            if(ch == '{' || ch == '[' || ch== '(') {
                stack.push(ch);
            } else {
                Character lastInserted = stack.pop();
                if(ch =='}' && lastInserted != '{' ||
                    ch ==']' && lastInserted != '[' ||
                    ch ==')' && lastInserted != '('
                ) {
                    return false;
                }
            }
        }

        return stack.size() == 0;

    }










    public boolean solution(String s) {
        Stack<Character> stack  = new Stack<>();
        for(char c : s.toCharArray()) {  // for n times
            if(c=='[') {
                stack.push(']');
            }
            else if(c=='{') {
                stack.push('}');
            }
            else if(c=='(') {
                stack.push(')');
            }
            else if(stack.isEmpty() || stack.pop()!=c) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    /* Analysis 
        Time: O(n)
        Space: O(n)
    */

    public boolean isValid(String s) {
        return solution(s);
    }
}