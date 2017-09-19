package XiaoDai;

public class SearchforaRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		int[] ans = SolutionSearchforaRange.searchRange(nums, 2);
		for (int i : ans) {
			System.out.println(i);
		}
	}

}

class SolutionSearchforaRange {
    public static int[] searchRange(int[] nums, int target) {
    	if(nums.length < 1)
            return new int[] {-1, -1};
        int left = -1, right = -1;
        int start = 0, end = nums.length - 1, mid = -1;
        while(start < end) {
        	mid = (start + end) / 2;
        	if(target > nums[mid])
        		start = mid + 1;
        	else
        		end = mid;
        }
        if(target != nums[start]) {
        	return new int[] {-1, -1};
        }
        left = start;
        start = 0;
        end = nums.length - 1;
        while(start < end) {
        	mid = (start + end) / 2 + 1;
        	if(target < nums[mid])
        		end = mid - 1;
        	else
        		start = mid;
        }
        right = start;
        return new int[] {left, right};
    }
}