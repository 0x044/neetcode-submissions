class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Base case check
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        // Map the frequency string to the list of actual words
        Map<String, List<String>> map = new HashMap<>();
        
        for (String str : strs) {
            int[] arr = new int[26];
            for (char c : str.toCharArray()) {
                arr[c - 'a']++;
            }
            
            // Convert array to a unique string key e.g., "[1, 0, 1...]"
            String key = Arrays.toString(arr);
            
            // If absent, initialize with an empty list
            map.computeIfAbsent(key, k -> new ArrayList<>());
            
            // Add the actual string to the group
            map.get(key).add(str);
        }
        
        // Return all grouped lists
        return new ArrayList<>(map.values());
    }
}
