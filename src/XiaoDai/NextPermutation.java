package XiaoDai;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 2, 1};
		SolutionNextPermutation.nextPermutation(nums);
		for(int num : nums) {
			System.out.println(num);
		}
	}

}

class SolutionNextPermutation {
    public static void nextPermutation(int[] nums) {
    	if(nums.length < 2)
    		return;
        int start = nums.length - 2;
        while(start >= 0) {
        	if(nums[start] < nums[start + 1]) {
        		int tmp = 0, i = 0;
        		for(i = nums.length - 1; i >= start + 1; --i) {
        			if(nums[i] > nums[start]) {
        				break;
        			}
        		}
        		tmp = nums[start];
        		nums[start] = nums[i];
        		nums[i] = tmp;
        		
        		int end = nums.length - 1;
            	start = start + 1;
            	while(start < end) {
            		tmp = nums[start];
            		nums[start] = nums[end];
            		nums[end] = tmp;
            		start++; end--;
            	}
            	break;
        	}
        	start--;
        }
        if(start < 0) {
        	start = 0;
        	int end = nums.length - 1;
        	while(start < end) {
        		int tmp = nums[start];
        		nums[start] = nums[end];
        		nums[end] = tmp;
        		start++; end--;
        	}
        }
    }
}
