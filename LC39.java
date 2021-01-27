import java.util.ArrayList;
import java.util.List;

public class LC39 {
    List<Integer> path = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();
    int len;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        len = candidates.length;
        dfs(0, target, candidates);
        return res;
    }

    private void dfs(int begin, int target, int[] candidates) {
        if (target < 0) return;
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        while (begin < len){
            path.add(candidates[begin]);
            dfs(begin, target - candidates[begin], candidates);
            path.remove(path.size() - 1);
            begin++;
        }
    }
}
