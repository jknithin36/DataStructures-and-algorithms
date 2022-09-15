public class BinaryTree {
  String[] arr;
  int lastUsedIndex;
  /*creation
   * Time Complexity: O(1)
   * Space Complexity:O(N)
   */
  public BinaryTree(int size){
    arr = new String[size+1];
    this.lastUsedIndex=0;
    System.out.println("Blank Tree of size "+ size+" has been created");
  }
  //isFull

  boolean isFull(){
    if(arr.length-1==lastUsedIndex){
    return true;
  }else{
    return false;
  }
}
  /*INSERT
   * Time Complexity: O(1)
   * Space Complexity:O(1)
   */
  void insert( String value) {
    if (!isFull()) {
      arr[lastUsedIndex+1] =value;
      lastUsedIndex++;
      System.out.println("The value of "+value+" has been inserted");
    } else {
      System.out.println("The BT is full");
    }
  }

  /*preorder
   * Time Complexity: O(N)
   * Space Complexity:O(N)
   */
   public void preOrder(int index) {
    if (index > lastUsedIndex) {
      return;
    }
    System.out.print(arr[index]+ " ");
    preOrder(index * 2);
    preOrder(index * 2 + 1);
  }
  /*inOrder
   * Time Complexity: O(N)
   * Space Complexity:O(N)
   */
  public void inOrder(int index){
    if (index > lastUsedIndex) {
      return;
    }
    inOrder(index*2);
    System.out.print(arr[index]+ " ");
    inOrder(index*2+1);
  }
  /*postOrder
   * Time Complexity: O(N)
   * Space Complexity:O(N)
   */
    public void postOrder(int index){
    if (index > lastUsedIndex) {
      return;
    }
    postOrder(index*2);
    postOrder(index*2+1);
    System.out.print(arr[index]+ " ");
    
  }
   /*level Order
   * Time Complexity: O(N)
   * Space Complexity:O(1)
   */
   public void levelOrder(){
    for(int i = 1; i<=lastUsedIndex;i++){
      System.out.print(arr[i]+" ");
    }
   }
  /*search
   * Time Complexity: O(N)
   * Space Complexity:O(1)
   */
    public int search(String value){
  for(int i=1;i<=lastUsedIndex;i++){
    if(arr[i]==value){
      System.out.println(value+" exist at the location: "+i);
      return i;
    }
  }
  System.out.println(" The value does not exist in the Bt ");
      return -1;
    }
    /*deleteNode
   * Time Complexity: O(N)
   * Space Complexity:O(1)
   */
  public void deleteNode(String value){
    int location = search(value);
    if(location ==-1){
      return;
    }else{
      arr[location]=arr[lastUsedIndex];
      lastUsedIndex--;
      System.out.println("The node is sucessfully deleted");
    }
  }

    /*deleteEntireBinaryTree
   * Time Complexity: O(1)
   * Space Complexity:O(1)
   */
  public void deleteEntireTree(){
    try{
arr=null;
System.out.println("The BT is SucessFully Deleted");
    }catch(Exception e){
System.out.println("There was error deleting the tree");
    }
  }
}
