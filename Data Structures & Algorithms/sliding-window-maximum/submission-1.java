class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> dq = new ArrayDeque<>(); 

        for (int right = 0; right < nums.length; right++) {
        
            while (!dq.isEmpty() && dq.peekFirst() < right - k + 1)
                dq.pollFirst();
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[right])
                dq.pollLast();

                
            dq.offerLast(right);

            if (right >= k - 1)
                res[right - k + 1] = nums[dq.peekFirst()];
            }   
        
        return res;
    }
}
