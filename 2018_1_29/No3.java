/**
 * 给定一个非负整数NUM表示为字符串，除去ķ从号码数字以使新数是最小的可能。
 * <p>
 * 注意：
 * num的长度小于10002并且将大于等于k。
 * 给定的数字不包含任何前导零。
 * 例1：
 * <p>
 * 输入：num =“1432219”，k = 3
 * 输出：“1219”
 * 说明：删除三位数字4,3和2，形成最小的新号码1219。
 * 例2：
 * <p>
 * 输入：num =“10200”，k = 1
 * 输出：“200”
 * 说明：删除前导1，数字为200.请注意，输出不能包含前导零。
 * 例3：
 * <p>
 * 输入：num =“10”，k = 2
 * 输出：“0”
 * 说明：从数字中删除所有的数字，剩下的都是0。
 */
public class No3 {

    public static void main(String[] args) {
        No3 o = new No3();
        String num = "112";
        int k = 1;
        num = o.removeKdigits(num, k);
        System.out.println(num);
    }

    public String removeKdigits(String num, int k) {
        char[] c_num = num.toCharArray();
        //如果要去除的数量等于num长度 返回 0
        if (num.length() == k) return "0";
        char[] nums = new char[c_num.length - k];
        for (int i = 0; i < c_num.length - 1 && k != 0; i++) {
            if (c_num[i] > c_num[i + 1])
                for (int j = i;j>=0  && k != 0 ;j--)
                    if (c_num[j] > c_num[i + 1]) {
                        c_num[j] = 0;
                        k--;
                    }
        }
        int n = 0;
        for (int i = 0; n < nums.length; i++) {
            if (c_num[i] != 0)nums[n++] = c_num[i];
        }
        String str = String.valueOf(nums).replaceFirst("^0*", "");
        if(str.isEmpty())return "0";
        return str;
    }

}
