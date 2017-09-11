package XiaoDai;

public class SwapNodesinPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ListNodeSwapNodesinPairs {
    int val;
    ListNodeSwapNodesinPairs next;
    ListNodeSwapNodesinPairs(int x) { val = x; }
}

class SolutionSwapNodesinPairs {
    public ListNodeSwapNodesinPairs swapPairs(ListNodeSwapNodesinPairs head) {
    	if(head == null)	return head;
    	ListNodeSwapNodesinPairs cur = head, next = head.next, tmp = head;
    	boolean isfirst = true;
    	while(cur != null && next != null) {
    		if(isfirst) {
    			tmp = next;
    			cur.next = next.next;
    			tmp.next = cur;
    			head = tmp;
    			tmp = cur;
    			cur = cur.next;
    			if(cur != null)		next = cur.next;
    			isfirst = false;
    		}
    		else {
    			tmp.next = next;
    			cur.next = next.next;
    			next.next = cur;
    			tmp = cur;
    			cur = cur.next;
    			if(cur != null)		next = cur.next;
    		}
    	}
    	return head;
    }
}
