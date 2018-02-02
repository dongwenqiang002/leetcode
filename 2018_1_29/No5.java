/**
 *
 */
public class No5 {

    public static void main(String[] args) {
        No5 o = new No5();
        int[] n = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int i = o.singleNonDuplicate(n);
        System.out.println(i);
    }

    public int singleNonDuplicate(int[] nums) {
        for(int i = 0 ; i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1])return nums[i];
        }
        return nums[nums.length-1];
    }

}
