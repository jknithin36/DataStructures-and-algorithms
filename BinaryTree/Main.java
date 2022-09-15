public class Main{
  public static void main(String[]args){
    BinaryTreeLL binaryTree = new BinaryTreeLL();
    binaryTree.insert(1);
    binaryTree.insert(2);
    binaryTree.insert(3);
    binaryTree.insert(4);
    binaryTree.insert(5);
    binaryTree.insert(6);
    binaryTree.levelOrder();
     System.out.println();
    binaryTree.deleteEntireTree();
    
    // BinaryNode N1 = new BinaryNode();
    // N1.value = 1;
    // BinaryNode N2 = new BinaryNode();
    // N2.value = 2;
    // BinaryNode N3 = new BinaryNode();
    // N3.value = 3;
    // BinaryNode N4 = new BinaryNode();
    // N4.value = 4;
    // BinaryNode N5 = new BinaryNode();
    // N5.value = 5;
    // BinaryNode N6 = new BinaryNode();
    // N6.value = 6;
    // BinaryNode N7 = new BinaryNode();
    // N7.value = 7;
    // BinaryNode N8 = new BinaryNode();
    // N8.value = 8;
    // BinaryNode N9 = new BinaryNode();
    // N9.value = 9;
    // N1.left = N2;
    // N1.right = N3;
    // N2.left = N4;
    // N2.right= N5;
    // N3.left = N6;
    // N3.right = N7;
    // N4.left = N8;
    // N4.right = N9;
    // binaryTree.root = N1;
    // binaryTree.searchNode(5);

  }
}