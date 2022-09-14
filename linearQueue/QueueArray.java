public class QueueArray {
  int arr[];
  int topOfQueue;
  int beginningOfQueue;
  /*Creation Of queue
   * Time Complexity:O(1)
   * Space Complexity:O(1)
   */
  public QueueArray(int size){
    this.arr = new int[size];
    this.topOfQueue = -1;
    this.beginningOfQueue = -1;
     System.out.println("The Queue is succesfully created with size of :" +size);
  }
  /*isFull
   * Time Complexity:O(1)
   * Space Complexity:O(1)
   */
  public boolean isFull(){
    if(topOfQueue==arr.length-1){
      return true;
    }else{
      return false;
    }
  }
  /*isEmpty
   * Time Complexity:O(1)
   * Space Complexity:O(1)
   */
  public boolean isEmpty(){
    if(beginningOfQueue==-1||(beginningOfQueue==arr.length)){
      return true;
    }else{
      return false;
    }
  }
  /*Enqueue
   * Time Complexity:O(1)
   * Space Complexity:O(1)
   */
  public void enQueue(int value){
    if(isFull()){
      System.out.println("The Queue is Full!");
    }else if(isEmpty()){
      beginningOfQueue=0;
      topOfQueue++;
      arr[topOfQueue]= value;
      System.out.println("SucessFully inserted "+ value +"in the queue");
    }else{
      topOfQueue++;
      arr[topOfQueue]= value;
      System.out.println("SucessFully inserted "+ value +"in the queue");
    }
  }
  /*DeQueue
   * Time Complexity :O(1)
   * Space Complexity:O(1)
   */
  public int deQueue(){
    if(isEmpty()){
      System.out.println("The queue is Empty...!");
      return -1;
    }else{
      int result = arr[beginningOfQueue];
      beginningOfQueue++;
      if(beginningOfQueue>topOfQueue){
        beginningOfQueue=topOfQueue=-1;
      }
      return result;
    }
  }
  /*peek
   * Time Complexity :O(1)
   * Space Complexity:O(1)
   */
  public int peek(){
    if(!isEmpty()){
      return arr[beginningOfQueue];
    }else{
      System.out.println("The Queue is Empty...!");
      return -1;
    }
  }
  /*Delete
   * Time Complexity :O(1)
   * Space Complexity:O(1)
   */
  public void deleteQueue(){
    arr = null;
    System.out.println("The Queue is Deleted");
  }
}
