class Solution {
    public int cuttingRope(int n) {
        if(n <= 3){
            return n - 1;
        }
        long sum = 1L;
        int mol = 1000000007;
        while(n > 4){
            sum *= 3;
            sum = sum % mol;
            n -= 3;
        }
        return (int)(sum * n % mol);
    }
}
