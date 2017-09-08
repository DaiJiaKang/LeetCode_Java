package XiaoDai;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class SolutionGenerateParentheses {
	public static void ParenthesisMathod(List<String> list, String str, int start, int end, int n) {
		if(str.length() == n * 2) {
			list.add(str);
			return;
		}
		if(start < n)
			ParenthesisMathod(list, str+"(", start+1, end, n);
		if(end < start)
			ParenthesisMathod(list, str+")", start, end+1, n);
	}
	
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        SolutionGenerateParentheses.ParenthesisMathod(ans, "", 0, 0, n);
        
        return ans;
    }
}