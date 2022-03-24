class Solution {
    public String[] permutation(String s) {
        if(s == null || s.length() == 0){
            return new String[0];
        }
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        ArrayList<String> result = new ArrayList<>();
        boolean[] visited = new boolean[s.length()];
        helper(charArr, 0, 0, visited, "", result);
        String[] answer = new String[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
    private void helper(char[] charArr, int start, int depth, boolean[] visited, String curStr, ArrayList<String> result){
        if(depth == charArr.length){
            result.add(new String(curStr));
        }
        for(int i = 0; i < charArr.length; i++){
            if(i > 0 && charArr[i] == charArr[i - 1] && visited[i - 1] == true){//pruning
                continue;
            }
            if(!visited[i]){
                visited[i] = true;
                helper(charArr, i, depth + 1, visited, curStr + charArr[i], result);
                visited[i] = false;
            }
        }
    }
}
