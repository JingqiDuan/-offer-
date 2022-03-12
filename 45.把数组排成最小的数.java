class Solution {
    public String minNumber(int[] nums) {
        if(nums == null || nums.length == 0){
            return "";
        }
        String[] strArr = new String[nums.length];
        for(int i = 0; i < nums.length; i++){
            strArr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strArr, (x, y) -> (x + y).compareTo(y + x));
        StringBuilder ans = new StringBuilder();
        for(String s : strArr){
            ans.append(s);
        }
        return ans.toString();
    }
}
