class Solution {
    public int[] constructArr(int[] a) {
        if(a == null || a.length == 0){
            return new int[0];
        }
        int[] result = new int[a.length];
        //multiplication before i
        for(int i = 0, tmp = 1; i < a.length; i++){
            result[i] = tmp;
            tmp *= a[i];
        }
        //multiplication after i
        for(int i = a.length - 1, tmp = 1; i >= 0; i--){
            result[i] *= tmp;
            tmp *= a[i];
        }
        return result;
    }
}
