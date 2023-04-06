class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int last = nums.length - 1;
        while(true) {
            int currIndex = (start + last) / 2;
            if(nums[currIndex] == target) return currIndex;
            if(start > last) return -1;
            if(target > nums[currIndex]) start = currIndex + 1;
            if(target < nums[currIndex]) last = currIndex - 1;
        }
    }
}