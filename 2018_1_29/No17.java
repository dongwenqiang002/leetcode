import java.util.HashMap;
import java.util.Map;

/**
 * I=1，V=5，X=10，L=50，C=100，D=500，M=1000。
 * 输入保证在1到3999的范围内。
 *
 * input : "DCXXI"
 * Output:  621
 *
 */
public class No17 {

    public static final Map<Object, Object> map = new HashMap<>();
    static {
        map.put('I',1  );
        map.put('V',5  );
        map.put('X',10 );
        map.put('L',50 );
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }

    public static void main(String[] args) {
        No17 o = new No17();
        System.out.println(o.romanToInt("MCMXCVI"));
    }

    public int romanToInt(String s) {
        s = s.trim();
        if(s.isEmpty())return 0;
        char[] cs = s.toCharArray();
        int n = 0 ;
        int a = (int)map.get(cs[0]);
        int b;
        for (int i = 0; i <cs.length-1 ; i++) {
             b = (int)map.get(cs[i+1]);
            if(a < b){
                n -=a;
            }else{
                n+=a;
            }
            a=b;
        }
        n+= (int)map.get(cs[cs.length-1]);
        return n;
    }

}
