package leetcode;

/**
 * Description：
 *
 * @author 吴瑾 (jin.wu@ucarinc.com)
 * @version 1.0 2019-07-05 15:03 by 吴瑾 (jin.wu@ucarinc.com) 创建
 */
public class Question26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        removeDuplicates(nums);
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
