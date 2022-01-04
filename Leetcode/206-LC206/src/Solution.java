public class Solution {
    // 方法一：非递归形式
//    public ListNode reverseList(ListNode head) {
//        ListNode pre = null;
//        ListNode cur = head;
//        while(cur != null) {
//            ListNode next = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//        }
//        return pre;
//    }

    // 方法二：递归形式
    public ListNode reverseList(ListNode head) {
       if (head == null || head.next == null)
           return head;

       ListNode rev = reverseList(head.next);
       head.next.next = head;
       head.next = null;;
       return rev;
    }
}
