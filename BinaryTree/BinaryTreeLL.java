import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {
  BinaryNode root;
  /* Creation
   * Time Complexity :O(1)
   * Space Complexity :O(1)
   */
  public BinaryTreeLL(){
    this.root = null;
  }
  /*PreOrder Travesal
   * Time Complexity:O(N)
   * Space Complexity:O(N)
   */
  void preOrder(BinaryNode node){
    if(node== null){
      return;
    }
    System.out.print(node.value+" ");
    preOrder(node.left);
    preOrder(node.right);
  }
  /*inOrder Travesal
   * Time Complexity:O(N)
   * Space Complexity:O(N)
   */
  void inOrder(BinaryNode node){
    if(node==null){
      return;
    }
    inOrder(node.left);
    System.out.print(node.value+" ");
    inOrder(node.right);
  }
  /*PostOrder Travesal
   * Time Complexity:O(N)
   * Space Complexity:O(N)
   */
  void postOrder(BinaryNode node){
    if(node==null){
      return;
    }
    postOrder(node.left);
    postOrder(node.right);
    System.out.print(node.value+" ");
  }
  /*levelOrder Travesal
   * Time Complexity:O(N)
   * Space Complexity:O(N)
   */
  void levelOrder(){
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while(!queue.isEmpty()){
      BinaryNode presentNode = queue.remove();
      System.out.print(presentNode.value+" ");
      if(presentNode.left!=null){
        queue.add(presentNode.left);
      }
      if(presentNode.right!=null){
        queue.add(presentNode.right);
      }

    }
  }
  /*search
   * Time Complexity:O(N)
   * Space Complexity:O(N)
   */
  public void searchNode(int value){
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while(!queue.isEmpty()){
      BinaryNode presentNode = queue.remove();
      if(presentNode.value==value){
        System.out.println("The value - " + value+" is found in tree");
        return;
      }else{
        if(presentNode.left!=null){
          queue.add(presentNode.left);
        }
        if(presentNode.right!=null){
          queue.add(presentNode.right);
        }
      }
    }
    System.out.println("The value - " + value+" is not found in tree");
  }
  /*Insertion
   * Time Complexity:O(N)
   * Space Complexity:O(N)
   */
void insert(int value){
  BinaryNode newNode = new BinaryNode();
  newNode.value = value;
  if(root==null){
    root = newNode;
    System.out.println("Inserted new Element");
    return;

  }
  Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
  queue.add(root);
  while(!queue.isEmpty()){
    BinaryNode presentNode = queue.remove();
    if(presentNode.left==null){
      presentNode.left=newNode;
      System.out.println("Successfully inserted");
      break;
    }else if(presentNode.right==null){
      presentNode.right = newNode;
      System.out.println("Sucessfully Inserted");
      break;
    }else{
      queue.add(presentNode.left);
      queue.add(presentNode.right);
    }
  }
}
  //Get Deepest node
   
   
  public BinaryNode getDeepestNode(){
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    BinaryNode presentNode = null;
    while(!queue.isEmpty()){
      presentNode = queue.remove();
      if(presentNode.left!=null){
        queue.add(presentNode.left);
      }
      if(presentNode.right!=null){
        queue.add(presentNode.right);
      }
    }
    return presentNode;
  }
  /*Delete Deepest node
   * Time Complexity:
   * Space Complexity:
   */
  public void deleteDeepestNode(){
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    BinaryNode previousNode, presentNode = null;
    while(!queue.isEmpty()){
      previousNode=presentNode;
      presentNode=queue.remove();
      if(presentNode.left==null){
        presentNode.right = null;
        return;
      }else if(presentNode.right==null){
        presentNode.left=null;
        return;
      }
      queue.add(presentNode.left);
      queue.add(presentNode.right);
    }

  }
  /*Delete Given Node
  * Time Complexity:O(N)
  * Space Complexity:O(N)
  */
  public void deleteNode(int value){
    Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
    queue.add(root);
    while(!queue.isEmpty()){
      BinaryNode presentNode = queue.remove();
      if(presentNode.value==value){
        presentNode.value=getDeepestNode().value;
        deleteDeepestNode();
        System.out.println("The node is deleted");
        return;
      }else{
        if(presentNode.left!=null)queue.add(presentNode.left);
        if(presentNode.right!=null)queue.add(presentNode.right);
      }
        
      }
      System.out.println("The node is doed not exist in tree");
    }
  /*Delete Entire Tree
  * Time Complexity:O(N)
  * Space Complexity:O(N)
  */
  public void deleteEntireTree(){
   root=null;
   System.out.println("The Treeis sucessfully deleted");
  }
}
