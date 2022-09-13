public class Stack {
  LinkedList linkedList;
  public Stack(){
    linkedList = new LinkedList();
  }
  /*push Method 
  *Time Complexity :O(1)
  *Space Complexity:O(1)
  */
  public void push(int value){
    linkedList.insertInLinkedList(value,0);
    System.out.println("Inserted "+value+" in Stack");
  }
  /*isEmpty Method 
  *Time Complexity :O(1)
  *Space Complexity:O(1)
  */
  public boolean isEmpty(){
    if(linkedList.head == null){
      return true;
    }else{
      return false;
    }
  }
  /*pop Method 
  *Time Complexity :O(1)
  *Space Complexity:O(1)
  */
  public int pop(){
    int result =-1;
    if(isEmpty()){
      System.out.println("the stack is empty");
    }else{
      result = linkedList.head.value;
      linkedList.deletionOfNode(0);
    }
    return result;
  }
  /*peek Method 
  *Time Complexity :O(1)
  *Space Complexity:O(1)
  */
  public int peek(){
    if(isEmpty()){
      System.out.println("the Stack is Empty");
      return -1;
    }else{
      return linkedList.head.value;
    }
  }
  /*Delete Method 
  *Time Complexity :O(1)
  *Space Complexity:O(1)
  */
  public void deleteStack(){
    linkedList.head = null;
    System.out.println("The stack os deleted");
  }
  
}
