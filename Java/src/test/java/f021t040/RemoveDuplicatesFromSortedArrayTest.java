package f021t040;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicates() {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int[] nums = new int[]{1,1,2};
        int retVal = removeDuplicatesFromSortedArray.removeDuplicates(nums);
        assertEquals(2, retVal);
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
    }
}