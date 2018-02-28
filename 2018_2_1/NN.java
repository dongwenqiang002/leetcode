import ann.MBean;

import javax.annotation.Resource;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 */
@MBean
public class NN {

    public String aa(){
        return "adasdas";
    }
    public static void main(String[] args) {
        NN o = new NN();
        int i = 564683516;
        boolean b = o.isHappy(i);
        System.out.println(b);

    }

    public boolean isHappy(int n) {
        for (int i = 0, s, r; i < 6; i++) {
            r = 0;
            while (n != 0) {
                s = n % 10;
                r += s * s;
                n /= 10;
            }
            n = r;
        }
        return n == 1;
    }

    public static boolean isHappy11(int n) {
        for (int i = 0 ,s,r=0; i < 3; i++) {
            while (n != 0) {
                s = n % 10;
                r += s * s;
                n /= 10;
            }
            while (r != 0) {
                s = r % 10;
                n += s * s;
                r /= 10;
            }
        }
        return n==1;
    }
}
