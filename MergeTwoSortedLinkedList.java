package stack;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class MergeTwoSortedLinkedList {
    public ListNode head;

    public MergeTwoSortedLinkedList(int val){
        ListNode temp = new ListNode(val);
        head = temp;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode head = null;
        ListNode current = null;

        while(temp1!=null && temp2!=null){
            if(temp1.val >= temp2.val){
                if(head==null){
                    head = temp1;
                    current = head;
                }else{
                    current.next = temp1;
                    current = current.next;
                }
                temp1 = temp1.next;
            }else{
                if(head==null){
                    head = temp2;
                    current = head;
                }else{
                    current.next = temp2;
                    current = current.next;
                }
                temp2 = temp2.next;
            }
        }

        if(temp1!=null){
            if(current==null){
                current = temp1;
            }else{
                current.next = temp1;
            }
        }
        if(temp2!=null){
            if(current==null){
                current = temp2;
            }else{
                current.next = temp2;
            }
        }

        return head;
    }



    public static void main(String[] args) {

    }
}
