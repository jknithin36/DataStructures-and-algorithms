public class CircularSingleLinkedList {
  public Node head;
  public Node tail;
  public int size;

  /*Creation of Circlar Linked List
  *Time Complexity : O(1)
  *space Complexity :O(1)
  */
  public Node createCSLL(int nodeValue){
   head = new Node();
   Node node = new Node();
   node.value = nodeValue;
   node.next = node;
   head= node;
   tail=node;
   size=1;
   return head;
  }
  /*Insertion Of Circular Linked List
   * Time Complexity :O(N)
   * Space Compplexity: O(1)
   */
    public void insertCSLL(int nodeValue, int location) {
    Node node = new Node();
    node.value = nodeValue;
    if (head == null) {
      createCSLL(nodeValue);
      return;
    } else if (location == 0) {
      node.next = head;
      head = node;
      tail.next = head;
    } else if (location >= size) {
      tail.next = node;
      tail = node;
      tail.next = head;
    } else {
      Node tempNode = head;
      int index = 0;
      while (index < location-1) {
        tempNode = tempNode.next;
        index++;
      }
      node.next = tempNode.next;
      tempNode.next = node;
    }
    size++;
  }

  /* Traversal of Circular Single Linked List
   * Time Complexity : O(N)
   * Space Complexity : O(1)
   */
  public void traverseCSLL(){
    if(head!=null){
      Node tempNode = head;
      for(int i=0;i<size;i++){
        System.out.print(tempNode.value);
        if(i!=size-1){
          System.out.print(" -> ");
        }
        tempNode = tempNode.next;
      }
      System.out.println("\n");
    }else{
      System.out.println("\n CSLL DOES NOT EXIST!...");
    }
  }
  /*Searching Node In Circular single Linked List
   * Time Complexity:O(N)
   * Space Compexity:O(1)
   */
  public boolean searchNode(int nodeValue){
    if(head!=null){
      Node tempNode = head;
      for(int i=0;i<size;i++){
        if(tempNode.value==nodeValue){
          System.out.print("Found node at location : "+i);return true;
        }
        tempNode = tempNode.next;
      }
    }
    System.out.println("Node not found! ");
    return false;
  }
  /* Deletion of Node from Circular Single Linked List
   * Time Complexity:O(N)
   * Space Compexity :O(1)
   */
  public void deleteNode(int location) {
    if (head == null) {
      System.out.println("The CSLL does not exist! ");
      return;
    } else if (location == 0) {
      head = head.next;
      tail.next = head;
      size--;
      if (size == 0) {
        tail = null;
        head.next = null;
        head = null;
      }
    } else if (location >= size) {
      Node tempNode = head;
      for (int i =0; i<size-1; i++) {
        tempNode = tempNode.next;
      }
      if (tempNode == head) {
        head.next = null;
        tail = head = null;
        size--;
        return;
      }
      tempNode.next = head;
      tail = tempNode;
      size--;
    } else {
      Node tempNode = head;
      for (int i=0; i < location-1; i++) {
        tempNode = tempNode.next;
      }
      tempNode.next = tempNode.next.next;
      size--;
    }
  }
  /* Deletion Of Entire Circular Single Linked List
   * Time Complexity :O(1)
   * Space Coplexity :O(1)
   */
  public void deleteCSLL(){
    if(head==null){
       System.out.println("The CSLL Does Not Exist!..");
    }else{
      head = null;
      tail.next = null;
      tail = null;
      System.out.println("The CSll is Succesfully Deleted");
    }
  }
  
}
