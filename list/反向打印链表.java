//输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.*;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(listNode != null){
            list.add(listNode.val);
            listNode = listNode.next;
        }
       Collections.reverse(list);
        return list;
    }
}