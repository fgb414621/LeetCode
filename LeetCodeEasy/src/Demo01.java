/**
 * ClassName: Demo01
 * Package: PACKAGE_NAME
 * Description:
 *给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出
 * 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 * @Author fgb
 * @Create 2023/12/12 11:58
 * @Version 1.0
 */
public class Demo01 {
    public static void main(String[] args) {
        int[] nums  ={2,7,11,15};
        twoSum(nums,17);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                arr[0] = i;
                arr[1] = j;
                }
            }
        }
        return arr;
    }
}
