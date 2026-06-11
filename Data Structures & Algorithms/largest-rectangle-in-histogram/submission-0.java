class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea=0, n = heights.length;

        for(int i = 0; i < n; i++){
            int height = heights[i];
            int rightMost = i+1;

            while(rightMost < n && heights[rightMost] >= height){
                rightMost++;
            }

            int leftMost = i;
            while(leftMost >= 0 && heights[leftMost] >= height){
                leftMost--;
            }

            rightMost--;
            leftMost++;
            maxArea = Math.max(maxArea, height * (rightMost - leftMost + 1));
        }
        return maxArea;
    }
}
