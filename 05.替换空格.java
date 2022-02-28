class Solution {
    public String replaceSpace(String s) {
        StringBuilder newStr = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c == ' '){
                newStr.append("%20");
            }else{
                newStr.append(c);
            }
        }
        return newStr.toString();
    }
}
