import java.util.Arrays;

/**
 * 编写一个函数来查找字符串数组中最长的公共前缀字符串。
 */
public class No14 {

    public static void main(String[] args) {
        No14 o = new No14();
        String[] strs = {"123123", "1231211", "12"};
        System.out.println(o.longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return null;
        char[] s = strs[0].toCharArray();
        char[] temp;
        for (int i = 1; i < strs.length; i++) {
            temp = strs[i].toCharArray();
            if (s.length > temp.length) {
                int j = 0;
                for (; j < temp.length; j++) {
                    if (s[j] != temp[j]) break;
                }
                s = strs[i].substring(0, j).toCharArray();
                continue;
            }
            for (int j = 0; j < s.length && j < temp.length; j++) {
                if (s[j] != temp[j]) {
                    s = strs[i].substring(0, j).toCharArray();
                }
            }
        }
        return String.valueOf(s);
    }

}
