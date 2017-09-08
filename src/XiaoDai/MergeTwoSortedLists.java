package XiaoDai;

public class MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hhh");
		ListNodeMergeTwoSortedLists l1 = new ListNodeMergeTwoSortedLists(1);
		ListNodeMergeTwoSortedLists l2 = new ListNodeMergeTwoSortedLists(4);
		ListNodeMergeTwoSortedLists l3 = new ListNodeMergeTwoSortedLists(10);
		ListNodeMergeTwoSortedLists l4 = new ListNodeMergeTwoSortedLists(2);
		ListNodeMergeTwoSortedLists l5 = new ListNodeMergeTwoSortedLists(3);
		ListNodeMergeTwoSortedLists l6 = new ListNodeMergeTwoSortedLists(5);
		l1.next = l2;
		l2.next = l3;
		l4.next = l5;
		l5.next = l6;
		SolutionMergeTwoSortedLists.mergeTwoLists(l1, l4);
	}

}

class ListNodeMergeTwoSortedLists {
    int val;
    ListNodeMergeTwoSortedLists next;
    ListNodeMergeTwoSortedLists(int x) { val = x; }
}

class SolutionMergeTwoSortedLists {
    public static ListNodeMergeTwoSortedLists mergeTwoLists(ListNodeMergeTwoSortedLists l1, ListNodeMergeTwoSortedLists l2) {
    	if(l1 == null)		return l2;
    	else if(l2 == null)	return l1;
    	else {
    		ListNodeMergeTwoSortedLists tmp, l1_next, l1_cur, l2_next, l2_cur;
    		tmp = l1.val < l2.val ? l1 : l2;
    		if(l1.val > l2.val)	{
    			l2 = l1;
    			l1 = tmp;
    		}
    		l1_next = l1_cur = l1;
    		l2_next = l2_cur = l2;
    		while(l1_next != null && l2_next != null) {
    			while(l1_next.val <= l2_next.val && l1_next != null && l2_next != null) {
    				l1_cur = l1_next;
    				l1_next = l1_next.next;
    			}
    			l2_cur = l2_next;
    			l2_next = l2_next.next;
    			l1_cur.next = l2_cur;
    			l2_cur.next = l1_next;
    			l1_cur = l1_cur.next;
    		}
    		while(l2_next != null) {
    			l2_cur = l2_next;
    			l2_next = l2_next.next;
    			l1_cur.next = l2_cur;
    			l2_cur.next = l1_next;
    			l1_cur = l1_cur.next;
    		}
    	}
        return l1;
    }
}
