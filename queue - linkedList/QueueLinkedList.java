public class QueueLinkedList{
  singleLinkedList list;
  /*creation
   * Time Complexity:O(1)
   * Space Complexity:O(1)
   */
  public QueueLinkedList(){
    list = new singleLinkedList();
    System.out.println("The Queue is Succesfully Created");
  }
  /*isEmpty
   * Time Complexity:O(1)
   * Space Complexity:O(1)
   */
  public boolean isEmpty(){
    if(list.head==null){
      return true;
    }else{
      return false;
    }
  }

   /*enQueue
   * Time Complexity:O(1)
   * Space Complexity:O(1)
   */
  public void enQueue(int value){
    list.insertInLinkedList(value,list.size);
    System.out.println("Sucessfully Inserted in the Queue");
  }

   /*deQueue
   * Time Complexity:O(1)
   * Space Complexity:O(1)
   */
  public int deQueue(){
    int value =-1;
    if(isEmpty()){
      System.out.println("the Queue is Empty");
    }else{
      value = list.head.value;
      list.deletionOfNode(0);
    }
    return value;
  }

   /*peek
   * Time Complexity:O(1)
   * Space Complexity:O(1)
   */
  public int peek(){
    if(isEmpty()){
      System.out.println("the Queue is Empty");
      return -1;

    }else{
      return list.head.value;
    }
  }

   /*delete
   * Time Complexity:O(1)
   * Space Complexity:O(1)
   */
  public void deleteQueue()
  {
list.head=null;
list.tail=null;
System.out.println("The Queue is Sucessfullyy deleted");
  }
}