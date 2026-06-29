class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length, len2 = nums2.length;
        int[] arr = new int[len1+len2];

        System.arraycopy(nums1, 0, arr, 0, len1);
        System.arraycopy(nums2, 0, arr, len1, len2);

        Arrays.sort(arr);

        int totalLen = arr.length;

        if(totalLen%2 == 0){
            return (arr[totalLen / 2 - 1] + arr[totalLen/2])/2.0;
        }else{
            return arr[totalLen/2];
        }
    }
}
