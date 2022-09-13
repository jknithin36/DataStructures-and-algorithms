public class Main{
  public static void main(String[]args){
    CircularDoubleLinkedList cdll = new CircularDoubleLinkedList();
    //To create cdll
    cdll.createCDLL(1);
    //to insert elements incdll
    cdll.insertNode(2, 1);
    cdll.insertNode(3,2);
    cdll.insertNode(4,3);
    cdll.insertNode(5,4);
    //to traverse cdll
    cdll.traverseCDLL();
    //to traverse cdll
    //cdll.reverseTraverseCDLL();
    //to search Node in cdll
    //cdll.searchNode(nodeValue);
    //to deleteNode in cdll
    //cdll.deleteNode(location);
    //to delete Entire CDll
    //cdll.deleteCDLL();
    
    
  }
  
}