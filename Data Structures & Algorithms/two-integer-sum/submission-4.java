class Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;
            Integer n = map.get(diff);
            
            if(n != null){
                return new int[] {n, i};
            }
            map.put(num, i);
        }

        return new int[]{};
    }
}
