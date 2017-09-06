package XiaoDai;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "((";
		System.out.println(SolutionValidParentheses.isValid(s));
		
	}

}

class SolutionValidParentheses {
	public static boolean isMatched(Character ch1, char ch2) {
		if( (ch1.charValue() == '(' && ch2 == ')') || (ch1.charValue() == ')' && ch2 == '(') )
			return true;
		if( (ch1.charValue() == '{' && ch2 == '}') || (ch1.charValue() == '}' && ch2 == '{') )
			return true;
		if( (ch1.charValue() == '[' && ch2 == ']') || (ch1.charValue() == ']' && ch2 == '[') )
			return true;
		return false;
	}
	
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        st.push(s.charAt(0));
        for(int index = 1; index < s.length(); ++index) {
        	if(st.size() > 0 && SolutionValidParentheses.isMatched(st.peek(), s.charAt(index)))
        		st.pop();
        	else
        		st.push(s.charAt(index));
        }
        if(st.isEmpty())	return true;
        else				return false;
    }
}