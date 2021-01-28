public class LC55 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i <= max && i < nums.length; i++) {
            max = Math.max(max, i + nums[i]);
        }
        return max >= nums.length;
    }
}
