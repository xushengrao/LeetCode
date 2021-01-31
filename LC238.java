public class LC238 {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] b = new int[len];
        b[0] = 1;
        int temp = 1;
        for (int i = 1; i < len; i++) {
            b[i] = b[i - 1] * nums[i - 1];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            b[i] *= temp;
            temp *= nums[i];
        }
        return b;
    }
}
