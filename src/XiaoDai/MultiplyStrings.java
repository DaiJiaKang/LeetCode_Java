package XiaoDai;

public class MultiplyStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuilder str1 = new StringBuilder("12345");
//		StringBuilder str2 = new StringBuilder("5");
		System.out.println(SolutionMultiplyStrings.multiply("9", "9"));
	}

}

class SolutionMultiplyStrings {
	public static StringBuilder string_multiply_char(String str, char ch) {
		StringBuilder ans = new StringBuilder();
		int num = 0, carry = 0;
		for(int i = str.length() - 1; i >= 0; --i) {
			int s = (ch - '0') * (str.charAt(i) - '0') + carry;
			num = s % 10;
			carry = s / 10;
			ans.insert(0, num);
		}
		if(carry > 0) {
			ans.insert(0, carry);
		}
		return ans;
	}
	public static StringBuilder string_plus_string(StringBuilder str1, StringBuilder str2) {
		StringBuilder ans = new StringBuilder();
		int num = 0, carry = 0;
		int i = str1.length() - 1, j = str2.length() - 1;
		while(i >= 0 && j >= 0) {
			int s = (str1.charAt(i) - '0') + (str2.charAt(j) - '0') + carry;
			num = s % 10;
			carry = s / 10;
			ans.insert(0, num);
			i--; j--;
		}
		while(i >= 0) {
			int s = str1.charAt(i) - '0' + carry;
			num = s % 10;
			carry = s / 10;
			ans.insert(0, num);
			i--;
		}
		while(j >= 0) {
			int s = str2.charAt(j) - '0' + carry;
			num = s % 10;
			carry = s / 10;
			ans.insert(0, num);
			j--;
		}
		if(carry > 0) {
			ans.insert(0, carry);
		}
		return ans;
	}
    public static String multiply(String num1, String num2) {
    	if(num1.equals("0") || num2.equals("0"))
    		return "0";
    	StringBuilder ans = new StringBuilder();
        for(int i = num2.length() - 1; i >= 0; --i) {
        	if(num2.charAt(i) == '0')
        		continue;
        	StringBuilder str = SolutionMultiplyStrings.string_multiply_char(num1, num2.charAt(i));
        	int j = i;
        	while(j++ < num2.length() - 1)
        		str.append(0);
        	ans = SolutionMultiplyStrings.string_plus_string(ans, str);
        }
        return ans.toString();
    }
}