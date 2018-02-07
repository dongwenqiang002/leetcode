import java.util.Arrays;

/**
 *
 */
public class No21 {

    public static void main(String[] args) {
        No21 o = new No21();
        int[] n1 = {2,3,1,1,4,0,0,0,0,0,0};
        int[] n2 = {0};
        System.out.println(o.canJump(n1));
    }

    public boolean canJump(int[] nums) {
        for (int i = 1; i <nums[0]+1 ; i++) {
            if(i >= nums.length-1)return true;
//            if(i+nums[i]+1 == nums.length-1)return true;
//            if(i+nums[i]+1 > nums.length-1)return false;
            if( canJump(Arrays.copyOfRange(nums, i,nums.length)))return true;
        }
        return false;
    }
}
