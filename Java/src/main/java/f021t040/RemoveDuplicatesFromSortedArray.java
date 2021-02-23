package f021t040;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 1) return nums.length;
        int cursor1 = 1;
        int cursor2 = 1;
        while (cursor2 != nums.length) {
            if (nums[cursor2] != nums[cursor2-1]) {
                nums[cursor1++] = nums[cursor2];
            }
            cursor2++;
        }
        return cursor1;
    }
}
