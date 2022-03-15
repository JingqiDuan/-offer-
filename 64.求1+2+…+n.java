class Solution {
    int result = 0;//stay outside of recursion
    public int sumNums(int n) {
        boolean b = n > 1 && sumNums(n - 1) > 0;
        result += n;
        return result;
    }
}
