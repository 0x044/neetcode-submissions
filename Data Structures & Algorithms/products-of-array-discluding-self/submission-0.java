class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zero = 0;
        int n = nums.length;
        int product = 1;
        int[] res = new int[n];
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                zero++;
            }else{
                product *= nums[i];
            }
        }

        for(int i = 0; i < n; i++){
            if(zero > 1){
                res[i] = 0;
            }else if(zero ==1){
                res[i] = nums[i]==0 ? product : 0;
            }else{
                res[i] = product/nums[i];
            }
        }

        return res;
    }
}  
