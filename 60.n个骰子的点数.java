class Solution {
    public double[] dicesProbability(int n) {
        int[][] dp = new int[n + 1][6 * n + 1];
        for(int i = 1; i <= 6; i++){
            dp[1][i] = 1;
        }

        for(int i = 2; i <= n; i++){
            for(int j = i; j <= 6 * i; j ++){//start from i
                for(int k = 1; k <= 6 && k < j; k++){// why it's 6? for dice i, possible number: 1...6
                    dp[i][j] += dp[i - 1][j - k];
                }
            }
        }

        double[] answer = new double[n * 6 - n + 1];//eg. when n = 3, there's no point 2
        for(int i = n; i <= 6 * n; i++){ // i<=6*n  or i < answer.length - n
            answer[i - n] = ((double) dp[n][i]) / Math.pow(6, n);
        }
        return answer;
    }
}
