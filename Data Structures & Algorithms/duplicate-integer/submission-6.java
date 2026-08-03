class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dSet = new HashSet<>();

        for(int n : nums){
            if(!dSet.add(n))
                return true;
        }

        return false;
    }
}