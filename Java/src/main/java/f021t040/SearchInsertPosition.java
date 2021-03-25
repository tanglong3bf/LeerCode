package f021t040;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        int l = 0;
        int r = nums.length;
        int m = r >> 1;
        while (nums[m] != target) {
            if (nums[m] > target) {
                r = m;
            } else {
                l = m + 1;
            }
            if (l >= r) {
                return l;
            }
            m = l + r >> 1;
        }
        return m;
    }
}
