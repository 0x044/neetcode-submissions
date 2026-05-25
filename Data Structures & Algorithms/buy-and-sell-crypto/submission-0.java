class Solution {
    public int maxProfit(int[] arr) {
        int minInd = 0;
        int maxDiff = 0;

        for(int i = 1; i < arr.length; i++){
            int diff = arr[i] - arr[minInd];
            maxDiff = Math.max(diff, maxDiff);

            if(arr[minInd] > arr[i]){
                minInd = i;
            }
       }

        if(maxDiff < 0){
            return 0;
        }else {
            return maxDiff;
        }   
    }
}
