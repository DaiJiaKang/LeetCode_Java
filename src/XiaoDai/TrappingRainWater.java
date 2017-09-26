package XiaoDai;

public class TrappingRainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(SolutionTrappingRainWater.trap(height));
	}

}

class SolutionTrappingRainWater {
    public static int trap(int[] height) {
    	int start = 0, end = height.length - 1;
    	int maxleft = 0, maxright = 0;
    	int ans = 0;
    	while(start < end) {
    		if(height[start] <= height[end]) {
    			if(height[start] >= maxleft)
    				maxleft = height[start];
    			else
    				ans += maxleft - height[start];
    			start++;
    		}
    		else {
    			if(height[end] >= maxright)
    				maxright = height[end];
    			else
    				ans += maxright - height[end];
    			end--;
    		}
    	}
        return ans;
    }
}