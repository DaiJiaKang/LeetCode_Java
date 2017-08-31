package XiaoDai;

import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "";
		SolutionofLetterCombinationsofaPhoneNumber.letterCombinations(digits);
	}

}

class SolutionofLetterCombinationsofaPhoneNumber {
    public static List<String> letterCombinations(String digits) {
    	LinkedList<String> ans = new LinkedList<String>();
        String[] ArrayStr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int i, j, k;
        for(i = 0; i < digits.length(); ++i) {
        	int num = Character.getNumericValue(digits.charAt(i));
        	if(ans.isEmpty()) {
        		String str = "";
				for(char ch : ArrayStr[num].toCharArray()) {
        			ans.add(str + ch);
        		}
			}
        	else {
        		while(i == ans.peek().length()) {
            		String str = ans.remove();
            		for(char ch : ArrayStr[num].toCharArray()) {
            			ans.add(str + ch);
            		}
            	}
        	}
        }
		return ans;
    }
}
