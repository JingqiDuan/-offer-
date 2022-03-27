class Solution {
    public int countDigitOne(int n) {
        int high = n;
        int low = 0;
        int cur = 0;
        int count = 0;
        int num = 1;
        // rolling combination lock
        while(high > 0 || cur > 0){
            cur = high % 10;
            high /= 10;
            if(cur == 0){
                count += high * num;
            }else if(cur == 1){
                count += high * num + low + 1;
            }else{
                count += (high + 1) * num;
            }
            low = cur * num + low;
            num *= 10;
        }
        return count;
    }
}
