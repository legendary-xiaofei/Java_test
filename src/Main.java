import E100_High_Fequence.ListSort;
import E100_High_Fequence.Maximum_Length_of_Pair_Chain;
import E100_High_Fequence.Task_Scheduling;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import javax.print.attribute.standard.NumberUp;
import java.util.*;

public class Main {

     public static void main(String[] args) {

         ListSort.ListNode listNode1 =new ListSort.ListNode(4);
         ListSort.ListNode listNode2 =new ListSort.ListNode(2);
         ListSort.ListNode listNode3 =new ListSort.ListNode(1);
         ListSort.ListNode listNode4=new ListSort.ListNode(3);

         listNode1.next=listNode2;
         listNode2.next=listNode3;
         listNode3.next=listNode4;
         listNode4.next=null;

//
////         System.out.println(new ListSort().sortList(listNode1));
//         ListSort.ListNode listNode =new ListSort().sortList(listNode1);
////         ListSort.ListNode listNode=listNode1;
//         while (listNode!= null){
//             System.out.print(listNode.val+" ");
//             listNode=listNode.next;
//         }



     }
}
