package XiaoDai;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {2, 3, 6, 7};
		List<List<Integer>> ans = SolutionCombinationSum.combinationSum(candidates, 7);
		for (List<Integer> list : ans) {
			for (Integer integer : list) {
				System.out.println(integer);
			}
		}
	}

}


class SolutionCombinationSum {
	public static void func(int[] candidates, ArrayList<Integer> array, 
			int target, List<List<Integer>> ans, int index) {
		if(target == 0) {
			ans.add((ArrayList<Integer>)array.clone());
			return;
		}
		for(int i = index; i < candidates.length; ++i) {
			if(candidates[i] <= target) {
				array.add(candidates[i]);
				func(candidates, array, target - candidates[i], ans, i);
				if(array.size() > 0)
					array.remove(array.size() - 1);
			}
		}
	}
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        func(candidates, new ArrayList<Integer>(), target, ans, 0);
        return ans;
    }
}