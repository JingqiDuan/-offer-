class Solution {
    public int numWays(int n) {
        if(n < 2){
            return 1;
        }
        int firstNum = 0, secondNum = 1, result = 2;
        for(int i = 2; i < n; i++){
            firstNum = secondNum;
            secondNum = result;
            result = (firstNum + secondNum) % 1000000007;
        }
        return result;
    }
}
