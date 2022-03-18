class Solution {
    public int[] singleNumbers(int[] nums) {
        int xor = 0;
        int a = 0;
        int b = 0;
        for(int n : nums){
            xor ^= n;
        }
        int div = 1;
        //two diff nums must have one of a digit equals to 1 from their xor
        //divide elements into two groups based on this
        while((div & xor) == 0){
            div <<= 1;
        }
        for(int n : nums){
            // == 1 is wrong
            if((div & n) != 0){
                a ^= n;
            }else{
                b ^= n;
            }
        }
        return new int[]{a, b};
    }
}
