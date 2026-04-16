class Solution {
    public boolean isSubsequence(String s, String t) {
        //idea: this is the brute force solution
        int length1 = s.length();
        int length2 = t.length();
        int[][] memo = new int[length1][length2]; //this is a table which helps us remember is the character at all the positions of s is a subcharacter in t
        for(int[] row : memo){
            Arrays.fill(row, -1);
        }
        return rec(s, t, 0, 0, memo);
    }

    private boolean rec(String s, String t, int i, int j, int[][] memo){
        int length1 = s.length();
        int length2 = t.length();
        if(i == length1) return true; 
        if(j == length2) return false;

        if(memo[i][j] != -1) return memo[i][j] == 1;
        if(s.charAt(i) == t.charAt(j)){
            memo[i][j] = rec(s, t, i + 1, j + 1, memo) ? 1 : 0;
        } else{
            memo[i][j] = rec(s, t, i, j + 1, memo) ? 1 : 0;
        }
        return memo[i][j] == 1;
    }
}