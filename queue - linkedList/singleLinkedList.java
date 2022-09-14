
public class singleLinkedList{
  public Node  head;
  public Node  tail;
  public int size;

  /*creation of singleLinkedList :
  Time complexity : O(1)
  Space complexity : O(1)*/
  public Node createSingleLinkedList(int nodeValue){
     head = new Node();
     Node node = new Node();
     node.next = null;
     node.value = nodeValue;
     head = node;
     tail = node;
     size=1;
     return head;
    }

    /*Insertion Method Single LinkedList:
    Time Complexity:O(N)
    Space Complexity:O(1)*/
    public void insertInLinkedList(int nodeValue, int location) {
    Node node = new Node();
    node.value = nodeValue;
    if (head == null) {
      createSingleLinkedList(nodeValue);
      return;
    } else if (location == 0) {
      node.next = head;
      head = node;
    } else if (location >= size) {
      node.next = null;
      tail.next = node;
      tail = node;
    } else {
      
      Node tempNode = head;
      int index = 0;
      while (index < location - 1) {
        tempNode = tempNode.next;
        index++;
      }
      Node nextNode = tempNode.next;
      tempNode.next = node;
      node.next = nextNode;
    }
    size++;
  }

  /*traversal of SingleLinkedList
  Time Complexity:O(N)
  Space Complexity:O(1)*/
  public void traverseSingleLinkedList(){
  if(head==null){
    System.out.println("Single Linked is Empty!...");
  }else{
    Node tempNode = head;
    for(int i =0;i<size;i++){
     System.out.print(tempNode.value);
     if(i!=size-1){
      System.out.print(" -> ");
     } 
     tempNode = tempNode.next;
    }
  }
  System.out.println("\n");
  }
    /*search for a node
    Time Compexity:O(n)
    Space Compexity:O(1)*/
    boolean searchNode(int nodeValue){
      if(head != null){
        Node tempNode = head;
        for(int i =0;i<size;i++){
        if(tempNode.value==nodeValue){
        System.out.print("Found the node at location: "+i+"\n");
        return true;
        }
        tempNode = tempNode.next;
        }
      }
      System.out.print("Node nod found!..");
      return false;
    }

    /*Deletion of Node from Single linked List
    Time Complexity : O(N)
    Space Cpmlexity : O(1)*/
    public void deletionOfNode(int location){
      if(head == null){
        System.out.println("The Single Linked List doesn't exist!...");
        return;
      }else if(location==0){
        head = head.next;
        size--;
        if(size==0){
          tail=null;
        }
      }else if(location >= size){
        Node tempNode = head;
        for(int i =0;i<size-1;i++){
          tempNode = tempNode.next;
        }
        if(tempNode==head){
          tail=head=null;
          size--;
          return;
        }
        tempNode.next = null;
        tail = tempNode;
        size--;

      }else{
      Node tempNode = head;
      for(int i = 0;i<location-1;i++){
      tempNode = tempNode.next;
      }
      tempNode.next=tempNode.next.next;
      size--;
      }
    }
  /*deletion of Entire Linked List
  Time Complexity : O(1)
  Space Complexity :O(1)*/
  public void deleteSingleLinkedList(){
  head=null;
  tail=null;
  System.out.println("Single Linked List is deleted");
  }
}



   
