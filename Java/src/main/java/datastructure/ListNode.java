package datastructure;

public class ListNode {
    //正常不要这么做，这里只是为了和leetcode兼容
    public int val;
    public ListNode next;
    public ListNode() {

    }
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}