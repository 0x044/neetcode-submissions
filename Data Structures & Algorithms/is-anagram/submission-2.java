class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sarr = new int[26];
        int[] tarr = new int[26];
        s = s.toLowerCase();
        t = t.toLowerCase();

        if(s.length() == t.length()){
            for(int i = 0; i < s.length(); i++){
                sarr[s.charAt(i) - 'a']++;
                tarr[t.charAt(i) - 'a']++;
            }
            if(Arrays.equals(sarr, tarr)){
                return true;
            }
        }

        return false;
    }
}
