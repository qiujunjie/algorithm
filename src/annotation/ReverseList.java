package annotation;

public class ReverseList {


    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();
        ListNode listNode = new ListNode(1);
        ListNode tmp = listNode;
        for (int i = 2; i <= 5; i++) {
            tmp.next = new ListNode(i);
            tmp.next = tmp.next.next;
        }
    }
}
