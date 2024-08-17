class Solution {
    int[][] memo;

    public int change(int amount, int[] coins) {
        memo = new int[coins.length][amount + 1];
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j <= amount; j++) {
                memo[i][j] = -1;
            }
        }
        return solve(coins, coins.length - 1, amount);
    }

    public int solve(int c[], int i, int j) {
        if (i == 0) {
            if (j % c[0] == 0) {
                return 1;
            } else {
                return 0;
            }
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        int take = 0;
        int not;
        not = solve(c, i - 1, j);
        if (c[i] <= j) {
            take = solve(c, i, j - c[i]);
        }
        memo[i][j] = take + not;
        return memo[i][j];
    }
}