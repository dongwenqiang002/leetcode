/**
 * 给定一个32位有符号整数，整数的反转数字。
 * <p>
 * 例1：
 * <p>
 * 输入： 123
 * 输出：   321
 * 例2：
 * <p>
 * 输入： -123
 * 输出： -321
 * 例3：
 * <p>
 * 输入： 120
 * 输出： 21
 */
public class No10 {

    public static void main(String[] args) {
        No10 o = new No10();
        int a = 1534236469;
        a = o.reverse(a);
        System.out.println(a);
    }

    public int reverse(int x) {
        long a = 0 ;
        while(x!=0){
            a = a*10 + x%10;
            x/=10;
        }
        if(a>Integer.MAX_VALUE||a<Integer.MIN_VALUE)return 0;
        return (int)a;
    }

}
