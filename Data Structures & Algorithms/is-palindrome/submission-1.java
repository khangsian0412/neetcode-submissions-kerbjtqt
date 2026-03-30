class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for(int i = 0; i < s.length(); i++){
            char charac = s.charAt(i);
            if(! (Character.isLetter(charac) || Character.isDigit(charac))){
                continue;
            }
            sb.append(charac);
        }
        for(int i = 0; i < sb.length(); i++){
            char charac1 = Character.toLowerCase(sb.charAt(i));
            char charac2 = Character.toLowerCase(sb.charAt(sb.length() - i - 1));
            if(charac1 != charac2){
                return false;
            }
        }
        return true;
    }
}
