public class SelectionSort {
  static void selectionSort(int arr[]){
    for(int j=0;j<arr.length;j++){
      int minimumIndex =j;
      for(int i=j+1;i<arr.length;i++){
      if(arr[i]<arr[minimumIndex]){
        minimumIndex=i;
      }
    }
    if(minimumIndex!=j){
      int temp = arr[j];
      arr[j]=arr[minimumIndex];
      arr[minimumIndex]= temp;
    }
  }
}

public static void printArray(int arr[]){
for(int i =0;i<arr.length;i++){
  System.out.print(arr[i]+" ");

}
System.out.println();
}
}
/*Selection Sort
 * Time Complexity : O(N^2);
 * Space Comlexity :O(1)
 * When To Use:
 * 1) When we have inSufficient Memory
 * 2) Easy to implement
 * When to Avoid:
 * When Time is Concern
 */