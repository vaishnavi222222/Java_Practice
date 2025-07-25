import java.util.Iterator;
import java.util.LinkedList;

class LinkedListDemo{
  public static void main(String[] args) {
    LinkedList<Integer> ll = new LinkedList<Integer>();
    ll.add(2);
    ll.addLast(3);
    ll.addFirst(6);
    ll.offer(4);
    ll.offerLast(8);
    ll.offerFirst(9);
    for(Integer x : ll){
      System.out.print(x+" ");
    }
    System.out.println();

    // using iterator
    Iterator<Integer>it = ll.iterator();
    while(it.hasNext()){
      System.out.print(it.next()+" ");
    }
    System.out.println();
    
    // using descending iterator
    Iterator<Integer> di = ll.descendingIterator();
    while(di.hasNext()){
      System.out.print(di.next()+" ");
    }
    System.out.println();
    
    //adding element in particular index
    ll.add(2,4);
    
    // for each in linkedlist
    ll.forEach(l -> System.out.print(l+" "));
    System.out.println();
    
    //inserting some(all) elements in particular position
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(3);
    list.add(4);
    list.add(7);
    list.add(0);
    list.add(4);
    list.add(2);
    list.add(1);
    ll.addAll(2,list);
    ll.forEach(l -> System.out.print(l+" "));
    System.out.println();
    
    //copyig a list into other list
    LinkedList<Integer> cl = LinkedList.clone(ll);
    cl.forEach(l -> System.out.print(l+" "));
  }
}