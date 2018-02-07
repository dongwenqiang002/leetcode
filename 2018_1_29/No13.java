/**
 * 给定n个非负整数代表每个柱的宽度为1的高程图，计算下雨后可以捕集多少水。
 * <p>
 * 例如，
 * 给定[0,1,0,2,1,0,1,3,2,1,2,1]，返回6。
 * <p>
 * ^
 * |
 * |
 * |             []
 * |      []水水水[][]水[]
 * |  []水[][]水[][][][][][]                6
 * -------------------------
 * <p>
 * 上面的高程图由数组[0,1,0,2,1,0,1,3,2,1,2,1]表示。在这种情况下，6个单位的雨水（蓝色部分）被困住了。感谢马科斯贡献这个形象！
 */
public class No13 {

    public static void main(String[] args) {
        No13 o = new No13();
        int[] n = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(o.trap(n));
    }

    public int trap(int[] height) {
        int n = 0;
        int left_max = 0, right_max = 0;
        int left = 0, right = height.length - 1;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= left_max) {
                    left_max = height[left];
                } else {
                    n += (left_max - height[left]);
                }
                left++;
            } else {
                if (height[right] >= right_max) {
                    right_max = height[right];
                } else {
                    n += (right_max - height[right]);
                }
                right--;
            }

        }
        return n;
    }
}
