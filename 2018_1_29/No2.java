/**
 * 反转一个单独的链表。
 */

public class No2 {

    public static void main(String[] args) {
        No2 o = new No2();
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        h1.next = h2;
        h2.next = h3;
        System.out.println(h1.val + "->" + h1.next.val + "->" + h1.next.next.val + "->");
        ListNode node = o.reverseList(h1);
        System.out.print(node.val + "->" + node.next.val + "->" + node.next.next.val + "->");
    }

    //1->2  3->4->5
    //1<-2<-3<-4<-5 4->5
    //1<-2  3<-4<-5
    public ListNode reverseList(ListNode head) {
        //当前节点
        ListNode cur = head;
        //上一节点
        ListNode prev = null;
        while(cur != null){
            //保存当前节点的下一节点
            ListNode next = cur.next;
            //将当前节点的下一节点指向上一节点
            cur.next = prev;
            //设置下一次循环的上一节点为当前节点
            prev = cur;
            //设置当前节点为下一个,继续循环
            cur = next;
        }
        return prev;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}