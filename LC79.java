public class LC79 {
    int n, m;
    public boolean exist(char[][] board, String word) {
        this.m = board.length;
        this.n = board[0].length;
        boolean[][] flag = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(flag, 0, i, j, word, board)) return true;
            }
        }
        return false;
    }

    private boolean dfs(boolean[][] flag, int k, int i, int j, String word, char[][] board) {
        if (i < 0 || j < 0 || i >= m || j >= n || flag[i][j] ||
                word.charAt(k) != board[i][j]) return false;
        if (k == word.length() - 1) return true;
        flag[i][j] = true;
        boolean res = dfs(flag, k + 1, i, j + 1, word, board) ||
                      dfs(flag, k + 1, i - 1, j, word, board) ||
                      dfs(flag, k + 1, i + 1, j, word, board) ||
                      dfs(flag, k + 1, i, j - 1, word, board);
        flag[i][j] = false;
        return res;
    }
}
