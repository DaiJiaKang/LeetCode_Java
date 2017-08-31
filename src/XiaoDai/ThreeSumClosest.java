package XiaoDai;
import java.lang.Math;
import java.util.Arrays;

public class ThreeSumClosest {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] nums = {0, 0, 0};
//		System.out.println(Solution.threeSumClosest(nums, 1));
//	}
}

class SolutionofThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
    	boolean isFirst = true, isFound = false;
        int ans = 0;
        int index = 0, front = 0, back = 0;
        Arrays.sort(nums);
        for(index = 0; index < nums.length; ++index) {
        	front = index + 1;
        	back = nums.length - 1;
        	while(front < back) {
        		int sum = nums[front] + nums[back] + nums[index];
        		if(sum < target) {
        			if(isFirst) {
        				ans = sum;
        				isFirst = false;
        			}
        			else {
        				if(Math.abs(sum - target) < Math.abs(ans - target)) {
        					ans = sum;
        				}
        			}
        			front++;
        		}
        		else if(sum > target) {
        			if(isFirst) {
        				ans = sum;
        				isFirst = false;
        			}
        			else {
        				if(Math.abs(sum - target) < Math.abs(ans - target)) {
        					ans = sum;
        				}
        			}
        			back--;
        		}
        		else {
        			ans = sum;
        			isFound = true;
        			break;
        		}		
        	}
        	if(isFound)
        		break;
        }        	        	      	
        return ans;
    }
}
