public class InsertionSort {
static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int temp = arr[i], j = i;
      while ( j> 0 && arr[j-1]>temp) {
        arr[j] = arr[j-1];
        j--;
      }
      arr[j] = temp;
    }
  }
public static void printArray(int arr[]){
for(int i =0;i<arr.length;i++){
  System.out.print(arr[i]+" ");

}
System.out.println();
}

}
/*Insertion Sort
 * Time Complexity : O(N^2);
 * Space Comlexity :O(1)
 * When To Use:
 * 1) When we have inSufficient Memory
 * 2) Easy to implement
 * 3) When we have Continous inflow of numbers and we want to keep them tem sorted
 * When to Avoid:
 * When Time is Concern
 */