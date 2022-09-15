import java.util.LinkedList;
import java.util.Queue;
public class BinarySearchTree {
  BinaryNode root;

  BinarySearchTree() {
    root = null;
  }

  // Insert Method
   private BinaryNode insert(BinaryNode currentNode, int value) {
    if (currentNode == null) {
      BinaryNode newNode = new BinaryNode();
      newNode.value = value;
      // System.out.println("The value successfully inserted");
      return newNode;
    } else if (value <= currentNode.value) {
      currentNode.left = insert(currentNode.left, value);
      return currentNode;
    } else {
      currentNode.right = insert(currentNode.right, value);
      return currentNode;
    }
  }

  void insert(int value) {
    root = insert(root, value);
  }


  // PreOrder Traversal

  public void preOrder(BinaryNode node) {
    if (node == null) {
      return;
    }
    System.out.print(node.value + " ");
    preOrder(node.left);
    preOrder(node.right);
  }
  //inOrder Traversal
  public void inOrder(BinaryNode node){
    if(node==null){
      return;
    }else{
      inOrder(node.left);
      System.out.print(node.value+" ");
      inOrder(node.right);
    }
  }
   //inOrder Traversal
  public void postOrder(BinaryNode node){
    if(node==null){
      return;
    }else{
      postOrder(node.left);
      postOrder(node.right);
      System.out.print(node.value+" ");     
    }
  }
  //levelOrder Traversal
  public void levelOrder(){
  Queue <BinaryNode> queue = new LinkedList<BinaryNode>();
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
  //search a Node
  public BinaryNode search(BinaryNode node,int value){
    if(node==null){
      System.out.println("value: "+value+ " not found in BST");
      return null;
    }else if(node.value==value){
      System.out.println("value: "+value+ "  found in BST");
      return node;
    }else if(value<node.value){
      return search(node.left,value);
    }else{
      return search(node.right,value);
    }
  }
  //Minimum Node
  public static BinaryNode minimumNode(BinaryNode root){
    if(root.left==null){
     return root;
    }else{
      return minimumNode(root.left);
    }
  }
  //Delete Node
  public BinaryNode deleteNode(BinaryNode root, int value) {
    if (root == null) {
      System.out.println("Value not found in BST");
      return null;
    }
    if (value < root.value) {
      root.left = deleteNode(root.left, value);
    } else if (value > root.value) {
      root.right = deleteNode(root.right, value);
    } else {
      if (root.left != null && root.right != null) {
        BinaryNode temp = root;
        BinaryNode minNodeForRight = minimumNode(temp.right);
        root.value = minNodeForRight.value;
        root.right = deleteNode(root.right, minNodeForRight.value);
      } else if (root.left != null) {
        root = root.left;
      } else if (root.right != null) {
        root = root.right;
      } else {
        root = null;
      }
    }

    return root;

  }
  //Delete Entire BST
  public void deleteBST(){
  root=null;
  System.out.println("The BST is SuccessFull Deleted");
  }
}

/*
 *     Type        Time Complexity     Space Complexity
 *    Creation     O(1)                O(1)
 *    Insertion    O(logN)             O(logN)
 *    traverse     O(N)                O(N)
 *    searchNode   O(logN)             O(logN)
 *    DeleteNode   O(logN)             O(logN)
 *    DeleteBST    O(1)                O(1)
 */

