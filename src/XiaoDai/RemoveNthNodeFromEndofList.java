package XiaoDai;

public class RemoveNthNodeFromEndofList {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		//String str = "123";
//		Demo d = new Demo();
//		System.out.println(d);
//	}

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { 
    	val = x; 
    }
}

class Solution {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	if(head == null)		return head;
        int m = 1;
        ListNode pre = head, next = head, cur = null;
        while(m < n) {
        	next = next.next;
        	m++;
        }
        if(next.next == null)	return head.next;
        while(next.next != null) {
        	next = next.next;
        	cur = pre;
        	pre = pre.next;
        }
        if(pre == next)			cur.next = null;
        else					cur.next = pre.next;
        return head;
    }
}