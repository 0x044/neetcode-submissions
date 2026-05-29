class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left=0, maxLen=0, maxCount=0;

        for(int right = 0; right<s.length(); right++){
            char rightChar = s.charAt(right);
            freq[rightChar - 'A']++;

            maxCount = Math.max(maxCount, freq[rightChar - 'A']);

            int currLen = right-left+1;

            if(currLen - maxCount > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(right - left + 1, maxLen);
        }
        return maxLen;
    }
}
