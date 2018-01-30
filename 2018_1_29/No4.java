/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回-1。
 * <p>
 * 例子：
 * <p>
 * s =“leetcode”
 * 返回0。
 * <p>
 * s =“loveleetcode”，
 * 返回2。
 * 注意：您可能会认为该字符串只包含小写字母。
 */
public class No4 {

    public static void main(String [] args) {
        No4 o = new No4();
        String s = "CaaaC";
        int i = o.firstUniqChar(s);
        System.out.println(i);
    }


    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        int j;
        for (int i = 0; i < c.length; i++) {
            j = 0;
            for (; j < c.length; j++) {
                if (c[i] == c[j] && i!=j) break;
            }
            if (j == c.length) return i;
        }
        return -1;
    }
}
