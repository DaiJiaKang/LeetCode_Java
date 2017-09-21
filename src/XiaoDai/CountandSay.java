package XiaoDai;

public class CountandSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SolutionCountandSay.countAndSay(5));
	}

}

class SolutionCountandSay {
	private static String[] array = new String[50];
	public static String func(String str) {
		if(str.equals("1"))		return "11";
		int num = 1, i = 0;
		StringBuilder ans = new StringBuilder();
		for(i = 0; i < str.length(); ++i) {
			if(i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				num++;
			}
			else {
				ans.append(String.valueOf(num)).append(str.charAt(i));
				num = 1;
			}
		}
		return ans.toString();
	}
    public static String countAndSay(int n) {
    	if(array[n] != null)
        	return array[n];
        if(n == 1)
        	return array[1] = "1";                  
        return array[n] = SolutionCountandSay.func(countAndSay(n - 1));
    }
}