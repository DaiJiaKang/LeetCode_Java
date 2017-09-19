package XiaoDai;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, 3, 5, 6};
		System.out.println(SolutionSearchInsertPosition.searchInsert(nums, 0));
	}

}

class SolutionSearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int index = 0;
        while(index < nums.length) {
        	if(target == nums[index])		break;
        	else if(target > nums[index])	index++;
        	else 							break;
        }
        return index;
    }
}
