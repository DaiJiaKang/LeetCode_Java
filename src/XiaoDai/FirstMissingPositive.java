package XiaoDai;

public class FirstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1 ,-2, 2, 5, 3, 1};
		System.out.println(SolutionFirstMissingPositive.firstMissingPositive(nums));
	}

}

class SolutionFirstMissingPositive {
    public static int firstMissingPositive(int[] nums) {
    	int index = 0;
    	for(; index < nums.length; ++index) {
    		while(nums[index] > 0 && nums[index] <= nums.length && 
    				nums[index] != nums[nums[index] - 1]) {
    			int dummy = nums[index];
    			nums[index] = nums[nums[index] - 1];
    			nums[dummy - 1] = dummy;
    		}
    	}
    	for(int i = 0; i < nums.length; ++i) {
    		if(i + 1 != nums[i])
    			return i + 1;
    	}
    	return nums.length + 1;
    }
}