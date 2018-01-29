/**
 * 有两个大小为m和n的排序数组nums1和nums2。
 * <p>
 * 找到两个排序数组的中位数。整体运行时间复杂度应该是O（log（m + n））。
 * <p>
 * 例1：
 * nums1 = [1,3]
 * nums2 = [2]
 * 中位数是2.0
 * <p>
 * 例2：
 * nums1 = [1,2]
 * nums2 = [3,4]
 * <p>
 * 中位数是（2 + 3）/ 2 = 2.5
 */
public class No1 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        No1 o = new No1();
        double r = o.findMedianSortedArrays(nums1, nums2);
        System.out.println(r);

    }


    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        boolean is = false;
        int n1 = 0, n2 = 0;
        int[] nums = new int[length / 2 + 1];
        //循环将俩数组中的数字按大小放入到nums中
        for (int i = 0; i < length / 2 + 1; i++) {
            is = n2 == nums2.length || (n1 < nums1.length && nums1[n1] < nums2[n2]);
            if (is) {
                nums[i] = nums1[n1];
                n1++;
            } else {
                nums[i] = nums2[n2];
                n2++;
            }
        }
        if (length % 2 == 0) {
            return (nums[nums.length - 1] + nums[nums.length - 2]) / 2.0;
        } else {
            return nums[nums.length - 1];
        }


    }
}
