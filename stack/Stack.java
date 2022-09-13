public class Stack {
  int[] arr;
  int topOfStack;
  /*Create
   * Time Complexity : O(1)
   * Space Complexity :O(N)
   */
  public Stack(int size){
  this.arr = new int[size];
  this.topOfStack=-1;
  System.out.println("The stack is created with : "+size);
  }
  /*isEmpty
   * Time Complexity:O(1)
   * Space Complexity:O(1)
   */
  public boolean isEmpty(){
    if(topOfStack==-1){
      return true;
    }else{
      return false;
    }
  }
  /*isFull
   * Time Complexity:O(1)
   * Space Complexity:O(1)
   */
  public boolean isFull(){
    if(topOfStack==arr.length-1){
      //System.out.println("The stack is full...!");
    return true;
  }else{
    return false;
  }
  }
  /*Push
   *  Time Complexity:O(1)
   * Space Complexity:O(1)  
   */
  public void push(int value){
    if(isFull()){
      System.out.println("The stack is full ...!");
    }else{
      arr[topOfStack+1] = value;
      topOfStack++;
      System.out.println("the value is succesfully inserted...!");
    }
  }
  /*pop
   *  Time Complexity:O(1)
   * Space Complexity:O(1)  
   */
  public int pop(){
    if(isEmpty()){
      System.out.println("the Stack is Empty...!");
      return -1 ;
    }else{
      int topStack = arr[topOfStack];
      topOfStack--;
      return topStack;
    }
  }
  /*peek
   *  Time Complexity:O(1)
   * Space Complexity:O(1)  
   */
  public int peek(){
    if(isEmpty()){
      System.out.println("the stack is Empty...!");
      return -1;
    }
    else{
      return arr[topOfStack];
    }
  }
  /* Delete
   *  Time Complexity:O(1)
   * Space Complexity:O(1)  
   */
  public void deleteStack(){
    arr=null;
    System.out.println("the stack is succesfully deleted");
  }
} 