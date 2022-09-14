public class CircularQueue {
  int[] arr;
  int topOfQueue;
  int beginningOfQueue;
  int size;
  /*creation
   * Time Complexity:O(1)
   * Space Complexity :O(N)
   */
  public CircularQueue(int size){
    this.arr = new int[size];
    this.size = size;
    this.topOfQueue = -1;
    this.beginningOfQueue = -1;
    System.out.println("The CiricularQueue is Sucessfully inserted...!");
  }
  /*isEmpty
   * Time Complexity:O(1)
   * Space Complexity :O(1)
   */
  public boolean isEmpty(){
    if(topOfQueue==-1){
      return true;
    }else{
      return false;
    }
  }
  /*isFull
   * Time Complexity:O(1)
   * Space Complexity :O(1)
   */
  public boolean isFull(){
    if(topOfQueue+1==beginningOfQueue){
      return true;
    }else if(beginningOfQueue==0&&topOfQueue+1==size){
      return true;
    }else{
      return false;
    }
  }
  /*Enqueue
   * Time Compexity:O(1)
   * Space Complexity: O(1)
   */
  public void enQueue(int value){
    if(isFull()){
      System.out.println("The Queue is Already Full...!");
    }else if(isEmpty()){
      beginningOfQueue=0;
      topOfQueue++;
      arr[topOfQueue]=value;
      System.out.println("Sucessfully inserted "+ value+" in the Queue");
    }else{
      if(topOfQueue+1==size){
        topOfQueue=0;

      }else{
        topOfQueue++;
      }
      arr[topOfQueue]=value;
      System.out.println("Sucessfully inserted "+ value+" in the Queue");
    }
  }
   /*dequeue
   * Time Compexity:O(1)
   * Space Complexity: O(1)
   */
  public int deQueue(){
    if(isEmpty()){
      System.out.println("The Queue is Empty");
      return -1;
    }else{
      int result = arr[beginningOfQueue];
      arr[beginningOfQueue]=0;
      if(beginningOfQueue==topOfQueue){
        beginningOfQueue=topOfQueue=-1;
      }else if(beginningOfQueue+1==size){
        beginningOfQueue=0;
      }else{
        beginningOfQueue++;
      }
      return result;
    }
  }
   /*peek
   * Time Compexity:O(1)
   * Space Complexity: O(1)
   */
  public int peek(){
    if(isEmpty()){
      System.out.println("The CQ is Empty");
      return -1;
    }else{
      return arr[beginningOfQueue];
    }
  }

   /*delete
   * Time Compexity:O(1)
   * Space Complexity: O(1)
   */
  public void deleteCQ(){
    arr = null;
    System.out.println("the CQ is Sucessfully deletd");
  }
}
