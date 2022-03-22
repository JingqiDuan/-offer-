class Solution {
    public int strToInt(String str) {
    	str = str.trim();
        if(str == null || str.length() == 0){
            return 0;
        }
        boolean isMinus = false;
        char[] strCharArr = str.toCharArray();
        long result = 0;
        if(strCharArr[0] >= '0' && strCharArr[0] <= '9' || strCharArr[0] == '-' || strCharArr[0] == '+'){
            if(strCharArr[0] == '-' || strCharArr[0] == '+'){
                if(strCharArr[0] == '-'){
                    isMinus = true;
                }
                //!!remove the first char
                strCharArr = Arrays.copyOfRange(strCharArr, 1, strCharArr.length);
            }
            for(int i = 0; i < strCharArr.length; i++){
                if(strCharArr[i] >= '0' && strCharArr[i] <= '9'){
                    //calculate value of char
                    result = result * 10 + strCharArr[i] - '0';
                    if(result > Integer.MAX_VALUE){
                        return isMinus ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                    }
                }else{
                    break;
                }
            }
            return isMinus ? -(int) result : (int) result;
        }
        return 0;
    }
}
