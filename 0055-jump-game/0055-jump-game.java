import java.util.*;

class Solution {

    public boolean canJump(int[] nums) {
        int reach = 0;

        for (int i = 0; i < nums.length && i <= reach; i++)
            reach = Math.max(reach, i + nums[i]);

        return reach >= nums.length - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        System.out.println(new Solution().canJump(nums));
    }
}