public class BinaryHeap {
  int arr[];
  int sizeOfTree;
  public BinaryHeap(int size){
    arr = new int[size];
    this.sizeOfTree=0;
    System.out.println("Binary Tree is Sucessfully created ");
  }
  public boolean isEmpty(){
    if(sizeOfTree==0){
    return true;
    }else{
      return false;
    }
  }
  //peek
  public Integer peek(){
    if(isEmpty()){
      System.out.println("Binary Heap is Empty");
      return null;
    }
    return arr[1];
  }
  public int sizeOfBH(){
    return sizeOfTree;
  }
   public void levelOrder(){
    for(int i=1;i<=sizeOfTree;i++){
   System.out.print(arr[i]+" ");
    }
    System.out.println("\n");
   }
   //Heapify
  public void heapifyBottomToTop(int index,String heapType){
  int parent = index/2;
if(index<=1){
  return;
}
if(heapType == "Min"){
  if(arr[index]<arr[parent]){
    int temp = arr[index];
    arr[index]=arr[parent];
    arr[parent]=temp;
  }
}else if(heapType == "Max"){
  if(arr[index]>arr[parent]){
    int temp = arr[index];
    arr[index]=arr[parent];
    arr[parent]=temp;
  }
}
heapifyBottomToTop(parent, heapType);
 }

 //Insertion

 public void insert(int value,String heapType){
  arr[sizeOfTree+1]=value;
  sizeOfTree++;
  heapifyBottomToTop(sizeOfTree, heapType);
  System.out.println("Inserted "+ value+" Successfully in Heap");
 }

 //heapiftTopT0Bottom
 public void heapifyTopToBottom(int index, String heapType) {
    int left = index*2;
    int right = index*2 + 1;
    int swapChild = 0;
    if (sizeOfTree < left) {
      return;
    }
    if (heapType == "Max") {
      if (sizeOfTree == left) {
        if (arr[index] < arr[left]) {
          int tmp = arr[index];
          arr[index] = arr[left];
          arr[left] = tmp;
        }
        return;
      } else {
        if (arr[left]>arr[right]) {
          swapChild = left;
        } else {
          swapChild = right;
        }
        if (arr[index] < arr[swapChild]) {
          int tmp = arr[index];
          arr[index] = arr[swapChild];
          arr[swapChild] = tmp;
        }
      }
    } else if (heapType == "Min") {
      if (sizeOfTree == left) {
        if (arr[index] > arr[left]) {
          int tmp = arr[index];
          arr[index] = arr[left];
          arr[left] = tmp;
        }
        return;
      } else {
        if (arr[left] < arr[right]) {
          swapChild = left;
        } else {
          swapChild = right;
        }
        if (arr[index] > arr[swapChild]) {
          int tmp = arr[index];
          arr[index] = arr[swapChild];
          arr[swapChild] = tmp;
        }
      }
    }
    heapifyTopToBottom(swapChild, heapType);
  }

  //Extract

 public int extractHeadOfBH(String heapType) {
    if (isEmpty()) {
      return -1;
    } else {
      int extractedValue = arr[1];
      arr[1] = arr[sizeOfTree];
      sizeOfTree--;
      heapifyTopToBottom(1, heapType);
      return extractedValue;
    }
  }
  //Delete EntireBinary Heap
  public void deleteEntireBH(){
    arr = null;
    System.out.println("The Binary Heap is SuccesFlly deleted");
  }
}


/*  Method          Time-Compexity    Space- Complexity   
 * 
 * Creation         O(1)              O(N)
 * Peek             O(1)              O(1)
 * levelOrder       O(N)              O(1)
 * Heapify(B To T)  O(logN)           O(logN)
 * Heapify(T To B)  O(logN)           O(logN)
 * Insertion        O(logN)           O(logN)
 * Extraction       O(logN)           O(logN)
 * Delete           O(l)              O(1)
 */