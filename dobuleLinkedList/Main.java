public class Main{
public static void main(String[]args){

  DobuleLinkedList dll = new DobuleLinkedList();
  dll.createDLL(1);
  dll.insertDLL(2, 1);
  dll.insertDLL(3,2 );
  dll.insertDLL(4,3 );
  dll.insertDLL(5,4 );
  dll.traverseDLL();
  dll.deleteNodeDLL(3);
  dll.traverseDLL();
  dll.deleteDLL();
  dll.traverseDLL();
}
}