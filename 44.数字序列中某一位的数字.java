class Solution {
    public int findNthDigit(int n) {
        int digit = 1;
        //use long
        long start = 1;
        long count = 9;
        //find how many n left for the start
        while(n > count){
            n -= count;
            digit++;
            start *= 10;
            count = digit * start * 9;
        }
        //get the number
        long num = start + (n - 1) / digit;
        //get the digit on that number
        return Long.toString(num).charAt((n - 1) % digit) - '0';
    }
}
