package com.org.niuke.swordtooffer;

import java.util.HashMap;

/**
 * 方法一：
 * <p>
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * <p>
 * 1）这里的f(n) 代表的是n个台阶有一次1,2,...n阶的 跳法数。
 * <p>
 * 2）n = 1时，只有1种跳法，f(1) = 1
 * <p>
 * 3) n = 2时，会有两个跳得方式，一次1阶或者2阶，这回归到了问题（1） ，f(2) = f(2-1) + f(2-2)
 * <p>
 * 4) n = 3时，会有三种跳得方式，1阶、2阶、3阶，
 * <p>
 * 那么就是第一次跳出1阶后面剩下：f(3-1);第一次跳出2阶，剩下f(3-2)；第一次3阶，那么剩下f(3-3)
 * <p>
 * 因此结论是f(3) = f(3-1)+f(3-2)+f(3-3)
 * <p>
 * 5) n = n时，会有n中跳的方式，1阶、2阶...n阶，得出结论：
 * <p>
 * f(n) = f(n-1)+f(n-2)+...+f(n-(n-1)) + f(n-n) => f(0) + f(1) + f(2) + f(3) + ... + f(n-1)
 * <p>
 * <p>
 * <p>
 * 6) 由以上已经是一种结论，但是为了简单，我们可以继续简化：
 * <p>
 * f(n-1) = f(0) + f(1)+f(2)+f(3) + ... + f((n-1)-1) = f(0) + f(1) + f(2) + f(3) + ... + f(n-2)
 * <p>
 * f(n) = f(0) + f(1) + f(2) + f(3) + ... + f(n-2) + f(n-1) = f(n-1) + f(n-1)
 * <p>
 * 可以得出：
 * <p>
 * f(n) = 2*f(n-1)
 * <p>
 * <p>
 * <p>
 * 7) 得出最终结论,在n阶台阶，一次有1、2、...n阶的跳的方式时，总得跳法为：
 * <p>
 * <p>
 * <p>
 * <p>
 * 方法二：
 * <p>
 * 【分析】 每个台阶可以看作一块木板，让青蛙跳上去，n个台阶就有n块木板，最后一块木板是青蛙到达的位子， 必须存在，
 * 其他 (n-1) 块木板可以任意选择是否存在，则每个木板有存在和不存在两种选择，(n-1) 块木板 就有 [2^(n-1)] 种跳法，可以直接得到结果。
 * <p>
 * 其实我们所要求的序列为：0,1,2,4,8,16,……
 * 所以除了第一位外，其他位的数都是前一位的数去乘以2所得到的积。
 */
public class FrogJumpFloorII {
    HashMap<Integer, Integer> intHash = new HashMap<>();

    public int JumpFloorII(int target) {
        if (target <= 2) {
            return target;
        }

        Integer result = intHash.get(target);
        if (result != null) {
            return result;
        }

        int temp = JumpFloorII(target - 1) << 1;

        intHash.put(target, temp);

        return temp;
    }
}
