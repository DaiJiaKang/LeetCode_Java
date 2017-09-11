package XiaoDai;

public class RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 1, 1};
		System.out.println(SolutionRemoveDuplicatesfromSortedArray.removeDuplicates(nums));
	}

}

class SolutionRemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
    	if(nums == null)	return 0;
        int ans = nums.length, end = nums.length - 1;
        for (int index = 0; index < end; index++) {
        	if(nums[index] == nums[index + 1]) {
        		int jndex = index + 1;
        		while(jndex < end) {
        			nums[jndex] = nums[jndex + 1];
        			jndex++;
        		}
        		end--;
        		ans--;
        		index--;
        	}
        }
        return ans;
    }
}
