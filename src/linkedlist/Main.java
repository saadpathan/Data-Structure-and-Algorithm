package linkedlist;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        
        /*LinkedList = stores Nodes in 2 parts (data + address)
                       Nodes are in non-consecutive memory locations
                       Elements are linked using pointers

                       Singly Linked List
              Node                Node                Node
        [data | address] -> [data | address] -> [data | address]

                       Doubly Linked List
                   Node                            Node 
        [address | data | address] <- > [address | data | address]
        
        advantages?
        1. Dynamic Data Structure (allocates needed memory while running)
        2. Insertion and Deletion of Nodes is easy. 0(1)
        3. No/Low memory waste

        disadvantages?
        1. Greater memory usage (additional pointer)
        2. No random access of elements (no index [i])
        3. Accessing/searching elements is more time consuming. o[n) I

        uses?
        1. implement Stacks/Queues
        2. GPS navigation
        3. music playlist
        */
        
        LinkedList<String> linkedList = new LinkedList<String>();
        
        //LinkedList as a Stack
        /*
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("E");
        linkedList.push("F");
        linkedList.pop();
       
        System.out.println(linkedList);
        */
        
        //LinkedList as a Queue
        
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");
        linkedList.offer("F");
        
        linkedList.add(4, "A+");
        System.out.println(linkedList);
       
        linkedList.poll();
        System.out.println(linkedList);
        
        linkedList.remove("A+");
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf("F"));
        
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        
        linkedList.addFirst("0");
        linkedList.addLast("1");
        System.out.println(linkedList);
        
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();
        System.out.println(first+ " & " +last);
        
        System.out.println(linkedList);

    }

}
