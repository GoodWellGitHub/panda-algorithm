package com.org.niuke.swordtooffer;

import java.util.HashMap;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class FrogJumpFloor {
    HashMap<Integer, Integer> intHash = new HashMap<>();

    public int JumpFloor(int target) {
        if (target <= 2) {
            return target;
        }
        Integer result = intHash.get(target);
        if (result == null) {
            result = JumpFloor(target - 2) + JumpFloor(target - 1);
            intHash.put(target,result);
        }
        return result;
    }
}
