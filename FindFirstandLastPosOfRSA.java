class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        result[0] = findBoundary(nums, target, true);   // Find first position
        result[1] = findBoundary(nums, target, false);  // Find last position
        return result;
    }
    
    private int findBoundary(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1;
        int idx = -1;  // Initialize index to -1 (not found)
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                idx = mid;  // Target found, update index
                if (isFirst) {
                    right = mid - 1;  // Move to the left part for first occurrence
                } else {
                    left = mid + 1;   // Move to the right part for last occurrence
                }
            } else if (nums[mid] < target) {
                left = mid + 1;  // Target is in the right part
            } else {
                right = mid - 1; // Target is in the left part
            }
        }
        return idx;  // Returns index or -1 if not found
    }
}
