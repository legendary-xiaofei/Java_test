import Exercise.ListNodeAbout;

public class Main {

     public static void main(String[] args) {

          ListNodeAbout.ListNode listNode1=new ListNodeAbout.ListNode(5);
          ListNodeAbout.ListNode listNode2=new ListNodeAbout.ListNode(2);

          ListNodeAbout.ListNode listNode4=new ListNodeAbout.ListNode(4);
          listNode1.next=listNode2;
          listNode2.next=listNode4;
          listNode1.next=null;

          ListNodeAbout.ListNode listNodea=new ListNodeAbout.ListNode(5);
          ListNodeAbout.ListNode listNodeb=new ListNodeAbout.ListNode(3);
          ListNodeAbout.ListNode listNodec=new ListNodeAbout.ListNode(4);

          listNodea.next=listNodeb;
          listNodeb.next=listNodec;
          listNodea.next=null;
          ListNodeAbout.ListNode listNode=null;
          listNode=new ListNodeAbout()
                  .addTwoNumbers(listNode1,listNodea);

          while (listNode!=null){

               System.out.print(listNode.val);
               listNode=listNode.next;
          }
     }
     static int f(int n){

          if (n==1||n==2){

               return 1;
          }
          return f(n-2)+f(n-1);
     }
}

