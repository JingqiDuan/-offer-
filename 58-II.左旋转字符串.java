class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder newStr = new StringBuilder();
        char[] charArr = s.toCharArray();
        int len = charArr.length;
        for(int i = n; i < len; i++){
            newStr.append(charArr[i]);
        }
        for(int i = 0; i < n; i++){
            newStr.append(charArr[i]);
        }
        return newStr.toString();
    }
}
