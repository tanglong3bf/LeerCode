package f021t040;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int cursor1 = 0;
        int cursor2 = nums.length-1;
        while (nums[cursor2]==val) {
            if (--cursor2 == -1) return 0;
        }
        while (cursor1 < cursor2) {
            if (nums[cursor1] == val) {
                int temp = nums[cursor1];
                nums[cursor1] = nums[cursor2];
                nums[cursor2--] = temp;
                continue;
            }
            ++cursor1;
        }
        if (nums[cursor2] == val) return cursor2;
        return cursor2+1;
    }
}
