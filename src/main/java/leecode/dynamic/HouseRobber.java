package leecode.dynamic;

public class HouseRobber {
  public int rob(int[] nums) {
    if (nums.length == 0)
      return 0;
    if (nums.length == 1)
      return nums[0];

    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);

    for (int i = 2; i < nums.length; i++) {
      dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
    }

    return Math.max(dp[nums.length - 1], dp[nums.length - 2]);
  }
}
