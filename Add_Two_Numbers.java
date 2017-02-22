package leetcode;

public class Add_Two_Numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode list11 = new ListNode(9);
		ListNode list12 = new ListNode(4);
		ListNode list13 = new ListNode(3);
		ListNode list21 = new ListNode(1);
		ListNode list22 = new ListNode(6);
		ListNode list23 = new ListNode(4);
		ListNode listp = list11;
		ListNode listq = list11;
		for(int i=0;i<10;i++){
			list11.next = new ListNode(9);
			list11 = list11.next;
		}
		list11.next = null;
		list12.next = list13;
		list13.next = null;
		list21.next = null;
		list22.next = list23;
		list23.next = null;
//		ListNode listp = list11;
		while(listp !=null){
			System.out.println(listp.val);
			listp = listp.next;
		}
		ListNode result = new Add_Two_Numbers().addTwoNumbers(listq,list21);
		System.out.println("end");
		while(result !=null){
			System.out.println(result.val);
			result = result.next;
		}
		
		
	}
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode relist,head;
        int temp,carry;
        carry = 0;
        
        head = new ListNode(0);
        relist = head;
        while(l1 !=null && l2 !=null){
        	if (l1.val + l2.val +carry >= 10){
        		temp = (l1.val + l2.val +carry )%10;
        		carry = 1;
        	}
        	else {
        		temp = l1.val + l2.val + carry;
        		carry = 0 ;
        	}
        	System.out.println(temp);
        	relist.next = new ListNode(temp);
        	relist = relist.next;
        	l1 = l1.next;
        	l2 = l2.next;
        }
        while (l1 != null && l2 == null){
        	if (l1.val  +carry >= 10){
        		temp = (l1.val +carry )%10;
        		carry = 1;
        	}
        	else {
        		temp = l1.val + carry;
        		carry = 0 ;
        	}
        	relist.next = new ListNode(temp);
        	relist = relist.next;
        	l1 = l1.next;
        }
        while (l1 == null && l2 != null){
        	if (l2.val  +carry >= 10){
        		temp = (l2.val +carry )%10;
        		carry = 1;
        	}
        	else {
        		temp = l2.val + carry;
        		carry = 0 ;
        	}
        	relist.next = new ListNode(temp);
        	relist = relist.next;
        	l2 = l2.next;
        }
        if(carry == 1){
        	relist.next = new ListNode(carry);
        }
		return head.next;
    }
	
}

class ListNode{
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
}