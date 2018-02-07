import java.util.LinkedList;
import java.util.List;

/**
 *
 */
public class No20 {

    public static void main(String[] args) {
        No20 o = new No20();
        System.out.println(o.mySqrt(2147395600));



    }

    public int mySqrt(int x) {
        for (long i = 1; i < x; i++) {
            if(i*i >x)return (int)i-1;
        }
       return x==0? 0:1;
    }

}
