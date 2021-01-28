import java.util.ArrayList;
import java.util.List;

public class LC78 {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        dfs(0, nums, new ArrayList<Integer>());
        return res;
    }

    private void dfs(int i, int[] nums,  ArrayList<Integer> path) {
        res.add(new ArrayList<>(path));
        while (i < nums.length) {
            path.add(nums[i]);
            dfs(i + 1, nums, path);
            path.remove(path.size() - 1);
            i++;
        }
    }
}
