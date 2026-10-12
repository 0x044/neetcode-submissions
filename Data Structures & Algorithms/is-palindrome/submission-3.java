class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]+", "");
        s = s.toLowerCase();

        int left, right = s.length()-1;

        for(left = 0; left < s.length() / 2; left++){
            if(s.charAt(left) != s.charAt(right)){ return false;}
            else{
                right--;
            }
        }

        return true;
    }
}
