class Solution {
    /*任何大于1的数都可由2和3相加组成（根据奇偶证明）
        因为2*2=1*4，2*3>1*5, 所以将数字拆成2和3，能得到的积最大
        因为2*2*2<3*3, 所以3越多积越大 */
    public int cuttingRope(int n) {
        if(n <= 3){
            return n - 1;
        }
        int sum = 1;
        while(n > 4){
            sum *= 3;
            n -= 3;
        }
        return sum * n;
    }
}
