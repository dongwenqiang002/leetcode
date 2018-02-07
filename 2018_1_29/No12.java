import java.util.Arrays;

/**
 *  字符串转数字
 */
public class No12 {

    public static void main(String[] args) {
        No12 o = new No12();
        String n = "214748364800";
        System.out.println(o.myAtoi(n));
    }

    public int myAtoi(String str) {
        str = str.trim();
        if(str.isEmpty())return 0;
        char[] s = str.toCharArray();
        long num = 0;
        int i = 0;
        if (s[0] == '-' || s[0]=='+') i++;
        for (; i < s.length && i<10; i++) {
            if (s[i] > '9' || s[i] < '0') break;
            num = num * 10 + (s[i] - '0');
        }
        if (s[0] == '-') num = -num;
        if(num<Integer.MIN_VALUE)return Integer.MIN_VALUE;
        if(num>Integer.MAX_VALUE)return Integer.MAX_VALUE;
        return (int)num;
    }

}
