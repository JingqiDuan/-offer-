class Solution {
    public int translateNum(int num) {
        String numStr = String.valueOf(num);
        int result = 1, lastResult = 1;
        //dp[i] = dp[i-2] + dp[i-1] when Xi-1,Xi in [10 : 25]
        //dp[i] = dp[i-1] when Xi-1,Xi not in [10 : 25]
        for(int i = 2; i <= numStr.length(); i++){
            String lastTwoDigits = numStr.substring(i - 2, i);
            int currentResult;
            if(lastTwoDigits.compareTo("10") >= 0 && lastTwoDigits.compareTo("25") <= 0){
                currentResult = result + lastResult;
            }else{
                currentResult = result;
            }
            lastResult = result;
            result = currentResult;
        }
        return result;
    }
}
