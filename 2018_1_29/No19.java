/**
 * 给定一个非负整数数组，最初定位在数组的第一个索引处。
 * <p>
 * 数组中的每个元素表示您在该位置的最大跳跃长度。
 * <p>
 * 你的目标是达到最小跳跃次数的最后一个索引。
 * <p>
 * 例如：
 * 给定数组A =[2,3,1,1,4]
 * <p>
 * 跳转到最后一个索引的最小数量是2。（1从索引0 跳转到1，然后跳到3最后一个索引。）
 * <p>
 * 注意：
 * 您可以假设您始终可以达到最后一个索引。
 */
public class No19 {

    public static void main(String[] args) {
        No19 o = new No19();
        int[] c = {2,3, 1};
        System.out.println(o.jump(c));
    }

    public int jump(int[] nums) {
        int n = 0;
        int temp;
        int index = 0;
        for (int i = 0; i < nums.length-1; ) {
            temp = 0;
            for (int j = 1; j < nums[i] + 1&&j+i<nums.length; j++) {
                if(i+j == nums.length-1)return  n+1;
                if (nums[i + j]+j >= temp) {
                    temp = nums[i + j]+j;
                    index = i+j;
                }
            }
            i = index;
            n++;
        }
        return n;
    }

}
