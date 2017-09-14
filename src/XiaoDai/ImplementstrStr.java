package XiaoDai;

public class ImplementstrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "mississippi";
		String needle = "ipp";
		//String str = "";
		//System.out.println(str.length());
		System.out.println(SolutionImplementstrStr.strStr(haystack, needle));
	}

}

class SolutionImplementstrStr {
    public static int strStr(String haystack, String needle) {
    	if(haystack.length() == 0 && needle.length() == 0)
    		return 0;
    	if(haystack == null || needle == null)
    		return -1;
    	int index = 0, jndex = 0, oklength = 0;
    	while(index < haystack.length()) {
    		jndex = 0;
    		while(jndex < needle.length() && index < haystack.length()) {
    			if(haystack.charAt(index) == needle.charAt(jndex)) {
    				index++; jndex++; oklength++;
    			}
    			else {
    				oklength = 0;
    				index = needle.length() - jndex + index;
    				jndex = needle.length() - 1;
    				while(jndex >= 0) {
    					if(needle.charAt(jndex) == haystack.charAt(index)) {
    						index = index - jndex;
    						jndex = 0;
    						break;
    					}
    					else	jndex--;
    				}
    				if(jndex == -1) {
    					index++; jndex = 0;
    				}
    			}
    		}
    		if(oklength == needle.length())	return index - needle.length() ;
    	}
        return -1;
    }
}