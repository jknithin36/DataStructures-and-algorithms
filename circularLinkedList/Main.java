public class Main{
  public static void main(String[]args){
    CircularSingleLinkedList csll = new CircularSingleLinkedList();
    //To create CSLL
    csll.createCSLL(1);
    //To Insert Nodes In CSll
    csll.insertCSLL(2,1);
    csll.insertCSLL(3,2 );
    csll.insertCSLL(4,3 );
    csll.insertCSLL(5,4 );
    csll.insertCSLL(6,5);
    //To travese CSll
    csll.traverseCSLL();
    //To search Node in CSLL
    //csll.searchNode(nodeValue);
    //To delete Node im CSll
    //csll.deleteNode(NodeValue);
    //To delete Entire CSLL
    //csll.deleteCSLL();
    
    
  }
}