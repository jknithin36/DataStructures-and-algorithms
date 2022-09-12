public class DobuleLinkedList {
  DoubleNode head;
  DoubleNode tail;
  int size;

  /*Creating new Dobule Linked List
   * Time Complexity:O(1)
   * Space Complexity:O(1)
   */
  public DoubleNode createDLL(int nodeValue){
    head = new DoubleNode();
     DoubleNode newNode = new DoubleNode();
     newNode.value = nodeValue;
     newNode.next = null;
     newNode.prev = null;
     head=newNode;
     tail = newNode;
     size = 1;
     return head;
  }
  /*Insertion a Node in Double Linked List
   * Time Complexity :O(N)
   * Space Complexity:O(1)
   */
  public void insertDLL(int nodeValue , int location){
    DoubleNode newNode = new DoubleNode();
    newNode.value=nodeValue;
    if(head==null){
      createDLL(nodeValue);
      return;
    }else if(location ==0){
      newNode.next = head;
      newNode.prev=null;
      head.prev=newNode;
      head=newNode;
    }else if(location>=size){
      newNode.next = null;
      tail.next = newNode;
      newNode.prev = tail;
      tail = newNode;
    }else{
      DoubleNode tempNode = head;
      int index =0;
      while(index<location-1){
        tempNode = tempNode.next;
        index++;
      }
       newNode.prev =tempNode;
       newNode.next = tempNode.next;
       tempNode.next = newNode;
       newNode.next.prev = newNode;
    }
    size++;
  }
  /*Traversal of Dobule Linked List
   * Time Complexity:O(N)
   * Space Complexity:O(1)
   */
  public void traverseDLL(){
    if(head!=null){
      DoubleNode tempNode = head;
      for(int i=0;i<size;i++){
        System.out.print(tempNode.value);
        if(i!=size-1){
          System.out.print(" -> ");
        }
        tempNode = tempNode.next;
      }
    }else{
      System.out.println("DLL does Not Exist!...");
    }
    System.out.print("\n");
  }
  /*Reverse Traversal of Double Linked List
   * Time  Comlexity:O(N)
   * Space Complexity:O(1)
   */
  public void reverseTraverseDLL(){
    if(head!=null){
      DoubleNode tempNode = tail;
      for(int i=0;i<size;i++){
        System.out.print(tempNode.value);
        if(i!=size-1){
          System.out.print(" <- ");
        }
        tempNode = tempNode.prev;
      }
    } else{
     System.out.println("DLL DOES NOT EXIST!....");
    }
    System.out.println("\n");
  }
  /*Searching Node in Double Linked List
   * Time Complexity:O(N)
   * Space Complexity:O(1)
   */
  public boolean searchNode(int nodeValue){
    if(head!=null){
      DoubleNode tempNode = head;
      for(int i =0;i<size;i++){
        if(tempNode.value ==nodeValue){
          System.out.print("The Node is found at location : "+i);
          return true;
        }
        tempNode = tempNode.next;
      }
    }
    System.out.print("Node not found!....");
    return false;
  }
  /*Delete A node In Double Linked List
   * Time Complexity:O(N)
   * Space Complexity:O(1)
   */
   public void deleteNodeDLL(int location) {
    if (head == null) {
      System.out.println("The DLL does Not Exist...!");
      return;
    }else if(location == 0){
      if(size==1){
        head=null;
        tail=null;
        size--;
        return;
      }else{
        head = head.next;
        head.prev = null;
        size--;
      }
    }else if(location >= size){
      DoubleNode tempNode = tail.prev;
      if(size==1){
        head=null;
        tail=null;
        size--;
        return;
      }else{
        tempNode.next = null;
        tail = tempNode;
        size--;
      }
    }else{
      DoubleNode tempNode = head;
      for(int i =0; i<location-1;i++){
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      tempNode.next.prev = tempNode;
      size--;
    }
  }
  /*Delete the Entire Linked List
   * Time Complexity:O(N)
   * Space Complexity:O(1)
   */
  public void deleteDLL(){
    DoubleNode tempNode = head;
    for(int i =0;i<size;i++){
      tempNode.prev = null;
      tempNode = tempNode.next;
    }
    head = null;
    tail = null;
    System.out.println("the Dll has been Deleted!..");
  }
  

  
}