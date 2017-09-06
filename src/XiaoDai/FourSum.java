package XiaoDai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FourSum {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int[] nums = {-497,-494,-484,-477,-453,-453,-444,-442,-428,-420,-401,-393,-392,-381,-357,-357,-327,-323,-306,-285,-284,-263,-262,-254,-243,-234,-208,-170,-166,-162,-158,-136,-133,-130,-119,-114,-101,-100,-86,-66,-65,-6,1,3,4,11,69,77,78,107,108,108,121,123,136,137,151,153,155,166,170,175,179,211,230,251,255,266,288,306,308,310,314,321,322,331,333,334,347,349,356,357,360,361,361,367,375,378,387,387,408,414,421,435,439,440,441,470,492};
//		List<List<Integer>> ans = SolutionFourSum.fourSum(nums, 1682);
//		System.out.println("111");
//		ans.clear();
//	}

}

class SolutionThreeSum {
	public static List<List<Integer>> threeSum(ArrayList<Integer> array, int target) {
		Collections.sort(array);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int index = 0, front = index + 1, back = array.size() - 1, sum = 0;
        for(; index < array.size(); ++index) {
        	front = index + 1;
        	back = array.size() - 1;
        	while(front < back) {
        		sum = array.get(index) + array.get(front) + array.get(back);
        		if(sum < target)		front++;
        		else if(sum > target)	back--;
        		else {
        			List<Integer> tmp_array = new ArrayList<Integer>();
        			tmp_array.add(array.get(index));
        			tmp_array.add(array.get(front));
        			tmp_array.add(array.get(back));
        			ans.add(tmp_array);
        			while(front < back && tmp_array.get(1) == array.get(front))	front++;
        			while(front < back && tmp_array.get(2) == array.get(back)) 	back--;
        		}
        		while(index + 1 < array.size() && array.get(index + 1) == array.get(index))	index++;
        	}
        }        
        return ans;
    }
}

class SolutionFourSum {
	public static void IntToArray(int[] nums, ArrayList<Integer> array) {
		for(int number : nums) {
			array.add(number);
		}
	}
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int index = 0;
        for(; index < nums.length; ++index) {
        	ArrayList<Integer> array = new ArrayList<Integer>();
        	SolutionFourSum.IntToArray(nums, array);
        	int i = index;
        	while(i >= 0) {
        		array.remove(i);
        		i--;
        	}
        	List<List<Integer>> tmp_ans = SolutionThreeSum.threeSum(array, target - nums[index]);
        	for(List<Integer> tmp_ans_element : tmp_ans) {
        		tmp_ans_element.add(nums[index]);
        		ans.add(tmp_ans_element);
        	}
        	while(index + 1 < nums.length && nums[index + 1] == nums[index])	index++;
        }        
        return ans;
    }
}



