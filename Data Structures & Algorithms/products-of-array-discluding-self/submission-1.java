class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] a1 = new int[n]; // Left/Prefix products
        int[] a2 = new int[n]; // Right/Suffix products
        
        // Base cases: no elements to the left of index 0 or right of index n-1
        a1[0] = 1;
        a2[n-1] = 1;
        
        // Fill the prefix array
        for(int i = 1; i < n; i++){
            a1[i] = a1[i-1] * nums[i-1];
        }
        
        // Fill the suffix array
        for(int i = n-2; i >= 0; i--){
            a2[i] = a2[i+1] * nums[i+1];
        }
        
        // Combine them into the final result
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            res[i] = a1[i] * a2[i];
        }
        
        return res;
    }
}
