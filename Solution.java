import java.util.ArrayList;
import java.util.List;

class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs("", n, n);


        return ans;
    }

    private void dfs(String s, int left, int right) {
        if (left == 0 && right == 0) {
            ans.add(s);
            return;
        }
        if (left < right) {
            return;
        }
        if (left > 0) {
            dfs(s + '(', left - 1, right);
        }
        if (right > 0) {
            dfs(s + ')', left, right - 1);
        }
    }

}