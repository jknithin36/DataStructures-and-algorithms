public class CircularDoubleLinkedList {
  public DoubleNode head;
  public DoubleNode tail;
  public int size;
  /*create DCLL
   * Time Complexity : O(1)
   * Space Complexity : O(1)
  */
  DoubleNode createCDLL(int nodeValue){
    head = new DoubleNode();
    DoubleNode newNode = new DoubleNode();
    newNode.value = nodeValue;
    head = newNode;
    tail = newNode;
    newNode.next = newNode;
    newNode.prev = newNode;
    size =1;
    return head;
  }
  /*
   * Insertion
   * Time Complexity :O(N)
   * Space Complexity:O(1)
   */
  void insertNode(int nodeValue,int location){
    DoubleNode newNode = new DoubleNode();
    newNode.value = nodeValue;
    if(head==null){
      createCDLL(nodeValue);
      return;
    }else if(location ==0){
      newNode.next = head;
      newNode.prev =tail;
      head.prev = newNode;
      tail.next = newNode;
      head = newNode;

    }else if(location >= size){
      newNode.next= head;
      newNode.prev = tail;
      head.prev = newNode;
      tail.next = newNode;
      tail = newNode;
    }else{
      DoubleNode tempNode = head;
      int index =0;
      while (index <location -1){
        tempNode = tempNode.next;
        index++;
      }
      newNode.prev = tempNode;
      newNode.next = tempNode.next;
      tempNode.next = newNode;
      newNode.next.prev = newNode;
    }
    size++;
  }
  /*Traversal
   * Time Complexity :O(N)
   * Space Complexity :O(1)
   */
  void traverseCDLL(){
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
      System.out.println("The CDLL does not exist...!");
    }
    System.out.println();
  }
  /*Reverse Traversal
   * Time Compexity:O(N)
   * Space Complexity:O(1)
   */
  void reverseTraverseCDLL(){
    if(head!=null){
      DoubleNode tempNode = tail;
      for(int i =0;i<size;i++){
        System.out.print(tempNode.value);
        if(i!=size-1){
          System.out.print(" -> ");
        }
        tempNode = tempNode.prev;
      }
    }else{
      System.out.println("The CSLL doesNot exist!...");
    }
    System.out.println();
  }
  /*Seaching a node in CDLL
   * Time Complexity: O(N)
   * Space Complexity: O(1)
   */
  boolean searchNode(int nodeValue) {
    if (head != null) {
      DoubleNode tempNode = head;
      for (int i = 0; i < size; i++) {
        if (tempNode.value == nodeValue) {
          System.out.println("The node is found at location: "+i);
          return true;
        }
        tempNode = tempNode.next;
      }
    }
    System.out.println("Node not found! ");
    return false;
  }
  /*delete Node
   * Time Compexity:O(N)
   * Space Complexity:O(1)
   */
  public void deleteNode(int location){
    if(head==null){
      System.out.println("The CDll does Not exist...!");
      return;
    }else if(location ==0){
      if(size == 1){
        head.prev = null;
        head.next = null;
        head = tail = null;
        size--;
        return;
      }else{
        head = head.next;
        head.prev = tail;
        tail.next = head;
        size--;

      }
    }else if(location >=size){
      if(size==1){
        head.prev = null;
        head.next = null;
        head = tail= null;
        size--;
        return;
      }else{
        tail = tail.prev;
        tail.next = head;
        head.prev = tail;
        size--;
      }
    }else{
      DoubleNode tempNode = head;
      for(int i =0;i<location-1;i++){
        tempNode = tempNode.next;

      }
      tempNode.next = tempNode.next.next;
      tempNode.next.prev = tempNode;
      size--;
    }
  }
  /*Delete Entire Linked List
   * Time Complexity :O(N)
   * Space Complexity: O(1)
   */
  public void deleteCDLL(){
    DoubleNode tempNode = head;
    for(int i =0;i<size;i++){
      tempNode.prev = null;
      tempNode = tempNode.next;
    }
    tail = null;
    head = null;
    System.out.println("CDLL WAS SUCCESFULLY DELETED...!");

  }
}
