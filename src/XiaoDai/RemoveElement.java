package XiaoDai;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3, 2, 2, 3};
		System.out.println(SolutionRemoveElement.removeElement(nums, 2));
	}

}

class SolutionRemoveElement {
    public static int removeElement(int[] nums, int val) {
    	int jndex = 0;
        for(int index = 0; index < nums.length; ++index) {
        	if(nums[index] != val)		nums[jndex++] = nums[index];
        }
        return jndex;
    }
}
