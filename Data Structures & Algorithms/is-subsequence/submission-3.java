class Solution {
    public boolean isSubsequence(String s, String t) {
        //idea: check if the substring of s is a substring of t. 
        int length1 = s.length();
        int length2 = t.length();
        if(length1 == 0 && length2 >= 0){
            return true;
        }
        if(length1 > 0 && length2 > 0 && s.charAt(length1 - 1) == t.charAt(length2 - 1)){
            return isSubsequence(s.substring(0, length1 - 1), t.substring(0, length2-1));
        }
        else if(length1 > 0 && length2 > 0 && s.charAt(length1 - 1) != t.charAt(length2 - 1)){
            return isSubsequence(s, t.substring(0, length2-1));
        }
        return false;
    }
}