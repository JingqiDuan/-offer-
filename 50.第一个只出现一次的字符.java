class Solution {
    public char firstUniqChar(String s) {
        if(s == null || s.equals("")){
            return ' ';
        }
        HashMap<Character, Boolean> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, !map.containsKey(c));
        }
        for(char c : s.toCharArray()){
            //find which value is ture
            if(map.get(c)){
                return c;
            }
        }
        return ' ';
    }
}
