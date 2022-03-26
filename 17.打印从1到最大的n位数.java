class Solution {
    public List<String> printNumbers(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1; i <= n ; i++){
            StringBuilder numString = new StringBuilder();
            helper(i, numString, result);
        }
        return result;
    }
    public  void  helper(int n, StringBuilder numString, List<String> result){
        if(n == 0) {
            result.add(numString.toString());
            return;
        }
        for(int i = 0; i <= 9; i++){
            if(i == 0 && numString.length() == 0){
                continue;
            }
            numString.append(i);
            helper(n - 1, numString, result);
            numString.deleteCharAt(numString.length() - 1);
        }
    }
}
