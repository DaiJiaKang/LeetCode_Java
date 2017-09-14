package XiaoDai;

public class DivideTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Integer.MAX_VALUE);
		System.out.println(SolutionDivideTwoIntegers.divide(5, -1));
	}

}

class SolutionDivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        if(divisor == 0)	return Integer.MAX_VALUE;
        if(dividend == Integer.MIN_VALUE && divisor == -1)
        	return Integer.MAX_VALUE;
        boolean ispositive = true;
        if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0))
        	ispositive = false;
        int ans = 0;
        long dividendl = Math.abs((long)dividend);
        long divisorl = Math.abs((long)divisor);
        while(dividendl >= divisorl) {
        	long tmp_divisorl = divisorl;
        	int dummy = 1;
        	while(dividendl >= (tmp_divisorl << 1)) {
        		tmp_divisorl <<= 1;
        		dummy <<= 1;
        	}
        	dividendl -= tmp_divisorl;
        	ans += dummy;
        }
        return ispositive ? ans : -ans;
    }
    
    
}



