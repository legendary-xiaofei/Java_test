package E100_High_Fequence;

import javax.print.attribute.standard.NumberUp;
import java.util.ArrayList;

public class Circular_linked_list {

    class ListNode{
        int val;
        ListNode next;
        ListNode (int x){
            val=x;
            next=null;
        }
    }

    /**
     * 传统的暴力循环，时间复杂度为o(n!)
     * @param head
     * @return
     */
    public ListNode detectCycle(ListNode head) {
        int pos=0;
//
//        ArrayList <ListNode> arrayList=new ArrayList<>();
        if (head!=null){

            ListNode p=head;


            while (true){
                if (p.next==null){

                    System.out.println("no cycle");
                    return null;
                }
                ListNode pp=head;
                for (int i=0;i<pos;i++){
                    if (p.equals(pp)){

                        System.out.println("tail connect to node index "+i);
                        return pp;
                    }
                    else {

                        pp=pp.next;
                    }

                }
//                arrayList.add(p);
                p=p.next;
                pos++;
            }
        }
        System.out.println("no cycle");
        return null;

    }

    /**
     * 快慢指针求链表环路问题
     * @param head
     * @return
     */

    public ListNode fast_and_slow_pointer(ListNode head){

        ListNode low=head;
        ListNode fast=head;
        ListNode crash=null;
        int index=0;
        boolean hascycle=false;
        if (low!=null){
            if (low.next==null){
                System.out.println("no cycle");
                return null;
            }
            while (low.next!=null){
                fast=fast.next.next;
                low=low.next;
                if (fast==null){
                    System.out.println("no cycle");
                    return null;
                }
                if (fast.equals(low)){
                    crash=fast;
                    hascycle=true;
                    break;
                }
            }

            if (hascycle){
                low=head;
                while (true){
                    if (low.equals(crash)){
                        System.out.println("tail conncet to node index "+index);
                        return low;
                    }
                    low=low.next;
                    crash=crash.next;
                    index++;
                }
            }

        }
        System.out.println("no cycle");
        return null;

    }
}
