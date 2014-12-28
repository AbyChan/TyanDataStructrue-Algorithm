import java.util.Set;
import java.util.HashSet;

public class LinkOperate{
public static void main(String[] args){
 Node head = null;
 Node temp = null;
 int datas[] = {3,6,2,1,6,8,4,8,4,3,8,9,5,7};
 for(int i=0; i<datas.length; i++){
  Node next = new Node(datas[i]);
  if(i == 0){
   head = temp = next;
   continue;
  }
  temp.setNext(next);
  temp = next;
 }

 show(head);

 insertSort2(head);
 show(head);
 
 delDul1(head);
 show(head);

  
}

public static void insertSort2(Node head){
 Node temp = head;
 Node mark = head;
 while(mark.getNext() != null){
  Node bei = temp.getNext();
  Node beinext = bei.getNext();
  int data = bei.getData();
  Node th = head;
  Node pre = null;
  do{
   if(th.getData() > data){
    if(th == head){
      bei.setNext(th);
      head = bei;
      } else {
      pre.setNext(bei);
      bei.setNext(th);
      }
    break;
    } else pre = th;
    th = th.getNext();
   }while(th == temp);
   mark.setNext(beinext);
   temp = mark.getNext();
   mark = mark.getNext();
  }
 show(head);
 }

 
/* public static void insertSort(Node head, Node n){
  Node temp = head;
  Node pre = null;
  Node bei = n.getNext();
  int data = n.getData();
  while(temp.getNext() != bei){
    if(temp.getData() > data){
     if(temp == head){
       n.setNext(temp);
       head = n;} else {
       pre.setNext(n);
       n.setNext(temp);}
    } else { pre = temp;}
    temp = temp.getNext();
  }
  temp.setNext(bei);
  if(bei.getNext() != null)
    insertSort(head, bei);
 }*/

 public static void delDul1(Node head){
  Node temp = head;
  Node pre = null;
  Set<Integer> ts = new HashSet<Integer>();
  while(temp != null){
   if(ts.contains(temp.getData())){
    pre.setNext(temp.getNext());
   } else {
    ts.add(temp.getData());
    pre = temp;
   }
   temp = temp.getNext();
  }
 }

 public static void show(Node n){
  while(n != null){
   System.out.print(n.getData() + " ");
   n = n.getNext();
  }
  System.out.println();
 }

}
