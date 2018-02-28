import java.util.Arrays;

/**
 *
 */
public class No21 {

    public static void main(String[] args) {
        No21 o = new No21();
        int[] n1 = {2, 3, 1, 1, 4};
        int[] n2 = {0};
        System.out.println(o.canJump(n1));
    }

    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        int temp, d=0;
        for (int i = 0; i < nums.length; ) {
            temp = 0;
            for (int j = i + 1, r = 1; j <= nums[i] + i; j++, r++) {
                if (j >= nums.length - 1) return true;
                if ((nums[j] + r) > temp) {
                    temp = nums[j] + r;
                    d = j;
                }
            }
            i = d;
            if (nums[i] == 0) return false;
            if (i == nums.length - 1) return true;
        }
        return false;
    }
}
