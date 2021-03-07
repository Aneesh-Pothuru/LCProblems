import java.util.*;

class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        int[] retVal = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])) {
                retVal[0] = hm.get(target - nums[i]);
                retVal[1] = i;
                return retVal;
            }
            hm.put(nums[i], i);
        }
        return retVal;
    }
}
