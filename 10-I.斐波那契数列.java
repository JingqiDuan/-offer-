class Solution {
    public int fib(int n) {
        if(n < 2){
            return n;
        }
        int first = 0, second = 1, result = 1;
        //sliding array
        for(int i = 2; i < n; i++){
            first = second;
            second = result;
            result = (first + second) % 1000000007;
        }
        return result;
    }
}
