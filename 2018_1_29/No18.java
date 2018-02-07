/**
 * Divide two integers without using multiplication, division and mod operator.
 * If it is overflow, return MAX_INT.
 *
 */
public class No18 {

    public static void main(String[] args) {
        No18 o = new No18();

    }

    public int divide(int dividend, int divisor) {
        if(divisor == 0) return Integer.MAX_VALUE;
        long s = (long)dividend/(long)divisor;
        if(s > Integer.MAX_VALUE || s< Integer.MIN_VALUE)return Integer.MAX_VALUE;
        return dividend/divisor;

    }

}
