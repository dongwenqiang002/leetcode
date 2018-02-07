/**
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * <p>
 * 1.     1             1
 * 2.     11            11
 * 3.     21            1111
 * 4.     1211          11111111
 * 5.     111221        1111111111111111
 * 6.     312211
 * 7.     13112221
 * 8.     1113213211
 * 9.     31131211131221
 * 10     13211311123113112211
 * 11     11131221133112132113212221
 * 12     3113112221232112111312211312113211
 */

public class No15 {

    public static void main(String[] args) {
        No15 o = new No15();
        int n = 5;
        System.out.println(o.countAndSay(n));
    }

    public String countAndSay(int n) {
        char[] r = {'1'};
        int s = 1;
        for (int i = 0; i < n-1; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < r.length; j++) {
                if (j != r.length-1 && r[j] == r[j + 1]) {
                    s++;
                } else {
                    stringBuilder.append(s).append(r[j]);
                    s = 1;
                }
            }
            r = stringBuilder.toString().toCharArray();
        }
        return String.valueOf(r);
    }

}
