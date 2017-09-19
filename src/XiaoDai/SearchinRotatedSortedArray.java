package XiaoDai;

public class SearchinRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class SolutionSearchinRotatedSortedArray {
    public int search(int[] nums, int target) {
        if(nums == null)	return -1;
        int index = 0, ans = -1;
        while(index < nums.length) {
        	if(target < nums[index]) {
        		index++;
        	}
        	else {
        		break;
        	}
        }
        while(index < nums.length) {
        	if(target == nums[index]) {
        		ans = index;
        	}
        	index++;
        }
        return ans;
    }
}

