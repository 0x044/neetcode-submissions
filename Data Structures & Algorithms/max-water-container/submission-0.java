class Solution {
    public int maxArea(int[] heights) {
        int maxi = 0;

        for(int i = 0; i < heights.length; i++){
            for(int j = i+1; j < heights.length; j++){

                int amount = Math.min(heights[i], heights[j])*(j-i);

                maxi = Math.max(maxi, amount);
            }
        }

        return maxi;
    }
}
