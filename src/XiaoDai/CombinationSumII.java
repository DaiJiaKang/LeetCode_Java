package XiaoDai;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class CombinationSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = {10, 1, 2, 7, 6, 1, 5};
		List<List<Integer>> ans = SolutionCombinationSumII.combinationSum2(candidates, 8);
		for (List<Integer> list : ans) {
			for (Integer integer : list) {
				System.out.print(integer);
			}
			System.out.println();
		}
	}

}

class SolutionCombinationSumII {
	public static void func(int[] candidates, ArrayList<Integer> array, 
			int target, List<List<Integer>> ans, int index, boolean[] isused) {
		if(target == 0) {
			if(!ans.contains(array))
				ans.add((ArrayList<Integer>)array.clone());
			return;
		}
		for(int i = index; i < candidates.length; ++i) {
			if(isused[i] == false && candidates[i] <= target) {
				array.add(candidates[i]);
				isused[i] = true;
				func(candidates, array, target - candidates[i], ans, i, isused);
				isused[i] = false;
				if(array.size() > 0)
					array.remove(array.size() - 1);
			}
		}
	}
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	 List<List<Integer>> ans = new ArrayList<List<Integer>>();
    	 Arrays.sort(candidates);
    	 boolean[] isused = new boolean[candidates.length];
         func(candidates, new ArrayList<Integer>(), target, ans, 0, isused);
         return ans;
    }
}
