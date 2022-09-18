public class Searching{
  //Time Complexity :O(N)
  //Space Complexity:O(1)
  //Linear - Search

  public static int linearSearch(int arr[],int value){
    for(int i=0;i<arr.length;i++){
      if(arr[i]==value){
        System.out.println("The Element is found at the index: "+i);
        return i;
      }
    }
    System.out.println("Not Found...!");
    return -1;
  }

  //Binary Search
  //Time Complexity : Worst Case = O(logN)   Best Case O(1)
  //Space Complexity : O(1)
   public static int binarySearch(int arr[], int value) {
    int start = 0;
    int end = arr.length-1;
    int middle = (start+end)/2;
    while (arr[middle] != value && start <= end) {
      if (value < arr[middle]) {
        end = middle -1;
      } else {
        start = middle + 1;
      }
      middle = (start+end)/2;
    }
    if (arr[middle] == value) {
      System.out.println("The element is found at the index: " + middle);
      return middle;
    } else {
      System.out.println("The element " + value+ " not found.");
      return -1;
    }
  }

}