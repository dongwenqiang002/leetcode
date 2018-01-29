/**
 * 合并k个已排序的链接列表并将其作为一个排序列表返回。分析并描述其复杂性。
 */
public class No5 {

    public static void main(String[] args) {
        No2 o = new No2();
        ListNode h1 = new ListNode(1);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        h1.next = h2;
        h2.next = h3;
        a1.next = a2;
        a2.next = a3;
        System.out.println(h1.val + "->" + h1.next.val + "->" + h1.next.next.val + "->");
        ListNode node = o.reverseList(h1);
        System.out.print(node.val + "->" + node.next.val + "->" + node.next.next.val + "->");
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 1){
            return lists[0];
        }else{
            ListNode[] node = new ListNode[(lists.length/2 + lists.length/2%2)];
            for (int i = 0; i+1 < lists.length ; i+=2) {
                mergeKLists(lists[i],lists[i+1]);
            }
        }
        return  null;
    }
    public ListNode mergeKLists(ListNode listNode1,ListNode listNode2) {

        return null;
    }

}
