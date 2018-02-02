/**
 * 实现正则表达式与支持匹配'.'和'*'。
 * <p>
 * '.' 匹配任何单个字符。
 * '*'匹配零个或多个前面的元素。
 * <p>
 * 匹配应覆盖整个输入字符串（不是部分）。
 * <p>
 * 函数原型应该是：
 * bool isMatch（const char * s，const char * p）
 * <p>
 * 一些例子：
 * isMatch（“aa”，“a”）→false
 * isMatch（“aa”，“aa”）→true
 * isMatch（“aaa aa“）→false
 * isMatch（”aa“，”a *“）→true
 * isMatch（”aa“，”.*“）→true
 * isMatch（”ab“，”.*“）→true
 * isMatch（” aab“，”c * a * b“）→true
 */
public class No6 {

    public static void main(String[] args) {
        No6 o = new No6();

    }

    public boolean isMatch(String s, String p) {
        char[] cs = s.toCharArray();
        char[] cp = p.toCharArray();

        for (int i = 0; i < cs.length; i++) {
            if (cs[i] != cp[i]) return false;
        }

        return false;
    }
}
