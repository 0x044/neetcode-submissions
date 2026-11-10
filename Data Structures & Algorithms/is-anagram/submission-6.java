class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sarr = new int[26];
        s = s.toLowerCase();
        t = t.toLowerCase();
    
        if(s.length() == t.length()){
            for(int i = 0; i < s.length(); i++){
                sarr[s.charAt(i) - 'a']++;
                sarr[t.charAt(i) - 'a']--;
            }
        }else{
            return false;
        }    

        for(int num : sarr){
            if(num > 0){
                return false;
            }
        }
        return true;
    }
}
