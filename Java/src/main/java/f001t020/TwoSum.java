package f001t020;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; ++i) {
            if (map.containsKey(target - nums[i])) {
                if (i == map.get(target - nums[i])) {
                    continue;
                }
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        //力扣官方的测试用例可以保证不会走到这里
        return null;
    }
}
