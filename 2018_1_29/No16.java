/**
 * 你正在爬楼梯的情况。需要n个步骤才能到达顶端。
 * <p>
 * 每次你可以爬上1或2步。有多少种不同的方法可以爬到顶端？
 * <p>
 * 注意：给定n将是一个正整数
 * <p>
 * 例1：
 * <p>
 * 输入： 2
 * 输出：   2
 * 说明：   有两种方法爬上顶部。
 * <p>
 * 1. 1步+ 1步
 * 2. 2个步骤
 * 例2：
 * <p>
 * 输入： 3
 * 输出：   3
 * 说明：   有三种方法爬上顶部。
 * <p>
 * 1. 1步+ 1步+ 1步
 * 2. 1步+ 2步
 * 3. 2步+ 1步
 */
public class No16 {

    public static void main(String[] args) {
        No16 o = new No16();
        int n = 3;
        System.out.println(o.climbStairs(n));
    }

    public int climbStairs(int n) {
        int[] s ={1,1};
        if(n==1 || n==0)return 1;
        for(int i = 1 ; i < n ; i++){
            s[1-i%2]+=s[i%2];
        }
        return s[0]>s[1]? s[0]:s[1];
    }
}
